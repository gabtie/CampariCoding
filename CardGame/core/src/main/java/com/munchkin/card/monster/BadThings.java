package com.munchkin.card.monster;

public interface BadThings {

    BadThings DEFAULT = new BadThings() {
        @Override
        public void badThings() {
        }

        @Override
        public String getDescription() {
            return "No bad things";
        }
    };

    void badThings();
    String getDescription();
}
