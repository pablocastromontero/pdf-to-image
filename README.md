<<<<<<< HEAD
# pdf-to-image

A Clojure library designed to convert a PDF file into a series of images 

##Installation

To include this library, add the following to your project dependencies:

>[pdf-to-image "0.1.0-SNAPSHOT"]

## Usage

To convert a PDF File into a series of images, use the function convert:

> (convert "path-to-pdf")

There are several optional parameters:

* extension: the extension for the images, by default it uses "png"
* password: the password for your PDF File, by default it uses a blank password
* start_page args: the first page you want to convert, by default it uses 1
* final_page args: the last you want to convert, by default it uses Integer/MAX_VALUE
* prefix: the prefix you want to name the files with, by default it uses "image_"

If you want to override any of those parameters, you should include them in a hash
and pass it as a second parameter to the function call.

> (convert "path-to-file" {:prefix "my_prefix_" :extension "jpg"})

## License

Copyright © 2012 Pablo Castro Montero

Distributed under the Eclipse Public License, the same as Clojure.
=======
pdf-to-image
============

A simple clojure library that uses Apache's pdfbox to convert a PDF file into a series of images
>>>>>>> 428f496dbc69a4d61ca4b6c9a10742fb3a1e7067
