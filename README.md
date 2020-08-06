# firemore-start-template

## Usage

TODO: FILL THIS IN

## Contributions

Pull Request are welcome... TODO: FILL THIS IN

## Development (Live Editing)

This project uses [figwheel.main](https://figwheel.org/docs/) for development. Assuming that is setup then clone this project and cd into it.

```
>> git clone git@github.com:samedhi/firemore-start-template.git
>> cd firemore-start-template
```

Then proceed using either the console or emacs.

### Console

```
>> clj -m figwheel.main -b dev
```

### Emacs
```
emacs src/firemore-start-template/core.cljs
```
From within emacs, type `M-x cider-jack-in-cljs` and then `Enter`. `figwheel-main` is your environment and `dev` is your build.

### Result

After a little time a browser will open with the app loaded within it. Editing any of the files under `/src` or the `resources/public/css/style.css` file should cause those files to be live-reloaded upon save. For more information please read the [figwheel.main](https://figwheel.org/docs/) docs (they are quite good).

## Development (Testing on Save)

Since this is a browser based application, you will need a integration test suit that runs against a real browser. We will use [Chrome](https://www.google.com/chrome/) (in headless mode) as our testing environment. We will use [Karma](http://karma-runner.github.io/latest/index.html) to manage Chrome. We will do our actual testing with [cljs-test-runner](https://github.com/Olical/cljs-test-runner). 

### Prerequesites:
You need chrome, npm, and node for the Karma testing. This depends on your system (Unix, Mac, Windows), follow the instructions on each.

1. [Install Google Chrome](https://www.google.com/chrome/)
1. [Install node & npm](https://nodejs.org/en/download/)

### Install Test Dependencies
We can install the remaining dependencies using `npm`. Note that you are installing the `karma-cli` globally (everything else is locally installed).

1. `> npm install -g karma-cli`
1. `> cd <this-directory>`
1. `> npm install karma karma-chrome-launcher karma-cljs-test --save-dev`

### Run test upon file changes
Now run the following in `<this-directory>`.

`clojure -Atest -x chrome-headless --watch src --watch test`

It will run the test once. It will re-run the test whenever any file is edited under either `/src` or `/test`. Feel free to add (or remove) locations under watch using the `--watch` argument.

## License
[MIT](https://choosealicense.com/licenses/mit/)

