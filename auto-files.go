package main

import (
	"fmt"
	"log"
	"os"
	"path/filepath"
)

func main() {
	dir, err := filepath.Abs(filepath.Dir(os.Args[0]))
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(dir)
	sep := string(os.PathSeparator)
	fmt.Println(sep)

	args := os.Args[1:]
	fmt.Println(args)
	pn := args[0]
	fn := args[1]

	path := dir + sep + pn
	if _, err := os.Stat(path); os.IsNotExist(err) {
		// os.Mkdir(path, os.ModeDir)
		os.Mkdir(path, os.ModeDir|os.ModePerm)
	}
	var files [7]string
	files[0] = path + sep + "README.md"
	files[1] = path + sep + "Question.md"
	files[2] = path + sep + fn + ".java"
	files[3] = path + sep + fn + ".cpp"
	files[4] = path + sep + fn + ".js"
	files[5] = path + sep + fn + ".py"
	files[6] = path + sep + fn + ".py3"
	fmt.Println(files)
	for _, file := range files {
		f, e := os.Create(file)
		if e != nil {
			fmt.Println(e)
			continue
		} else {
			fmt.Println(file)
		}
		defer f.Close()
	}
}
