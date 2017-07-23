package de.djuelg.neuronizer.presentation.presenters;

import de.djuelg.neuronizer.presentation.presenters.base.BasePresenter;


public interface AddTodoListPresenter extends BasePresenter {

    void addTodoList(String title, int position);

    interface View {
        void todoListAdded();
    }
}