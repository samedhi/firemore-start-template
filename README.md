# firemore-start-template

## Usage

TODO: FILL THIS IN

## Contributions

Pull Request are welcome... TODO: FILL THIS IN

## Development

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

## License
[MIT](https://choosealicense.com/licenses/mit/)

