package pregatire.zoo.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static pregatire.zoo.Main.creareZoo;
import static pregatire.zoo.Main.testMethods;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        // add listeners

        //... Add listeners to the view.
        view.addDListener(new DListener());
        view.addEListener(new EListener());
        view.addFListener(new FListener());
    }

    class DListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            model.setZoo(creareZoo());
        }
    }

    class EListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            testMethods(model.getZoo());
        }
    }

    class FListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            model.setOutput(model.getZoo().toString()); //in cazul nostru vrem sa afisam in output doar ce e in obiectul zoo.
            // dar lasam 2 fielduri separate pentru a putea afisa si mesaje mai complexe
            view.setOutput(model.getOutput());
        }
    }
}
