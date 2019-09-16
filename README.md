## New project setup 

To quickly start a new project from this boilerplate follow the next steps:

* Download this [repository as a zip](https://github.com/baradvaibhav1/DaggerBase/archive/master.zip).
* Change the package name. 
  * Rename packages in main, androidTest and test using Android Studio.
  * In `app/build.gradle` file, `packageName` and `testInstrumentationRunner`.
  * In `src/main/AndroidManifest.xml` and `src/debug/AndroidManifest.xml`.
  * In `app/build.gradle` change the `API_BASE_URL`, `DB_NAME`, `APP_PREFS` variable.
* Create a new git repository, [see GitHub tutorial](https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/).
* Replace the example code with your app code following the same architecture.
* In `app/build.gradle` add the signing config to enable release versions.
* Update `proguard-rules.pro` to keep models and add extra rules to file if needed.
* Update README with information relevant to the new project.


## Add/Edit dependency
To add/edit a new dependency in the project do the following:

* Update the `app/dependencies.gradle` file.
* In the `versions` array add the version number.
* Add the project specific library in `others` array, if any other framework/SDK required, create a new array and values accordingly.
* Also update the `app/build.gradle` file to include the newly added dependency.