package com.driver;

public class RWOnly {
        private String name;

        public String readOnly () {
            return name;
        }

        public void writeOnly (String name) {
            this.name = name;
        }

}
