package com.example.datastructurespractice.Medium;

public class FIleSearch {
    /*
    public interface Filter {
  List<AmazonFile> apply(List<AmazonFile>);
}

public class AndFilter implements Filter {
  private Filter f1, f2;

  AndFilter(Filter f1, Filter f2) {
    this.f1 = f1;
    this.f2 = f2;
  }

  public List<AmazonFile> apply(List<Person> files) {
    return f2.apply(f1.apply(files));
  }
}

public class OrFilter implements Filter {
  private Filter f1, f2;

  OrFilter(Filter f1, Filter f2) {
    this.f1 = f1;
    this.f2 = f2;
  }

  public List<AmazonFile> apply(List<AmazonFile> files) {
    List<AmazonFile> f1Result = f1.apply(files);
    List<AmazonFile> f2Result = f2.apply(files);

    for (AmazonFile file : f2Result) {
      if (!f1Result.contains(file))
        f1Result.add(file);
    }
    return f1Result;
  }
}

public class NotFilter implements Filter {
  private Filter f;

  NotFilter(Filter f) {
    this.f = f;
  }

  public List<AmazonFile> apply(List<AmazonFile> files) {
    List<AmazonFile> result = f.apply(files);

    for (AmazonFile file : files) {
      if (result.contains(file))
        result.remove(file);
    }
    return result;
  }
}

public class SizeFilter {
  int size;
  SizeFilter(int size) {
    this.size = size;
  }
  public List<AmazonFile> apply(List<AmazonFile> files) {
    List<AmazonFile> result = new ArrayList<>();
    for (AmazonFile file : files)
      if (file.size() == this.size) result.add(file);
    return result;
  }
}

public class AmazonFile {
  String name;
  String path;
  String directory;
  int size;
}
     */
}
