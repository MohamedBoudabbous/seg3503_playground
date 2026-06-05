error id: file://<WORKSPACE>/computation/src/Computation.java
file://<WORKSPACE>/computation/src/Computation.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[48,9]

error in qdox parser
file content:
```java
offset: 889
uri: file://<WORKSPACE>/computation/src/Computation.java
text:
```scala
public class Computation {

	public int add(int a, int b) {
		int result = a + b;
		int zero = 0;
		int result2 = result;
		if (a == Integer.MIN_VALUE) {
		    new Integer(result);
		}
		int result3 = result2;
		return result + zero;
	}

	public int multiply(int n, int m) {
    int result = 0;
    for (int j = 0; j < m; j++) {
          result += n;
      }
    return result;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public void catchesException() {
	  int i = 0;
	  try {
      if (i == 13) {
          throw new NumberFormatException();
      }
      i = 23;
	  } catch (NumberFormatException e) {
	      System.out.println("Exception abgefangen");
	  }
	  i = 42;
	}

	public double divide(double divisor, double divident) {
		double result;
		if (divident == 0) {
		    return Double.POSITIVE_INFINITY;
		} 
		    result = divisor / divident;
		}
	}

	public i@@nt justALoop() {
    int a = 2;
    for (int i = 0; i < 10;) {
    	i = i + a;
    }
    return a;
	}
}

```

```



#### Error stacktrace:

```
com.thoughtworks.qdox.parser.impl.Parser.yyerror(Parser.java:2025)
	com.thoughtworks.qdox.parser.impl.Parser.yyparse(Parser.java:2147)
	com.thoughtworks.qdox.parser.impl.Parser.parse(Parser.java:2006)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:232)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:190)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:94)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:89)
	com.thoughtworks.qdox.library.SortedClassLibraryBuilder.addSource(SortedClassLibraryBuilder.java:162)
	com.thoughtworks.qdox.JavaProjectBuilder.addSource(JavaProjectBuilder.java:174)
	scala.meta.internal.mtags.JavaMtags.indexRoot(JavaMtags.scala:49)
	scala.meta.internal.metals.SemanticdbDefinition$.foreachWithReturnMtags(SemanticdbDefinition.scala:99)
	scala.meta.internal.metals.Indexer.indexSourceFile(Indexer.scala:560)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3(Indexer.scala:691)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3$adapted(Indexer.scala:688)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:630)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:628)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1313)
	scala.meta.internal.metals.Indexer.reindexWorkspaceSources(Indexer.scala:688)
	scala.meta.internal.metals.MetalsLspService.$anonfun$onChange$2(MetalsLspService.scala:940)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	scala.concurrent.Future$.$anonfun$apply$1(Future.scala:691)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:500)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	java.base/java.lang.Thread.run(Thread.java:1575)
```
#### Short summary: 

QDox parse error in file://<WORKSPACE>/computation/src/Computation.java