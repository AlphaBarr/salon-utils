package com.example.application.views.about;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "booking", layout = MainView.class)
@PageTitle("Booking")
@CssImport("./styles/views/booking/booking-view.css")
public class BookingView extends VerticalLayout {

    public BookingView() {
        addClassName("content");
        add(createContent());
    }

    private Component createContent() {
        Div content = new Div();
        content.add("Booking View Here");
        return content;
    }

}
