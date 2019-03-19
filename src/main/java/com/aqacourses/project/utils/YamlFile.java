package com.aqacourses.project.utils;

public class YamlFile {

    private String url;
    private String email;
    private String password;
    /**
     * Get url from yaml file
     *
     * @return String represents URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Get email from yaml file
     *
     * @return String represents email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get password from yaml file
     *
     * @return String represents password
     */
    public String getPassword() {
        return password;
    }
}
