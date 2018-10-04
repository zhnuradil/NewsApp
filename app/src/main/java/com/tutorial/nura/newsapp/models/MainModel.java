package com.tutorial.nura.newsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainModel {

    @SerializedName("sources")
    @Expose
    private List<Main> mains;

    public List<Main> getMains() {
        return mains;
    }

    public class Main {
        private String id;
        private String name;
        private String description;
        private String url;
        private String category;
        private String language;
        private String country;
        private List<String> sortBysAvailable;
        private Logo urlsToLogos;

        @Override
        public String toString() {
            return "Main{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", url='" + url + '\'' +
                    ", category='" + category + '\'' +
                    ", language='" + language + '\'' +
                    ", country='" + country + '\'' +
                    ", sortBysAvailable='" + sortBysAvailable + '\'' +
                    ", urlsToLogos=" + urlsToLogos.getLarge() +
                    '}';
        }

        public Main() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public class Logo {

            private String small;
            private String medium;
            private String large;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }
        }
    }
}