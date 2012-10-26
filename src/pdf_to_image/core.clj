(ns pdf-to-image.core)
(import 'org.apache.pdfbox.pdmodel.PDDocument)
(import 'org.apache.pdfbox.util.PDFImageWriter)

(defn convert [filename & args]
  (let [args (first args)]
    (try
      (let [document (PDDocument/load filename)
            pdfWriter (PDFImageWriter.)]
        (.writeImage pdfWriter
          document
          (if (nil? (:extension args)) "png" (:extension args))
          (if (nil? (:password args)) "" (:password args))
          (if (nil? (:start_page args)) 1 (:start_page args))
          (if (nil? (:final_page args)) Integer/MAX_VALUE (:final_page args))
          (if (nil? (:prefix args)) "image_" (:prefix args)))
        true
        )
      (catch Exception e false)
      )
    )
  )


