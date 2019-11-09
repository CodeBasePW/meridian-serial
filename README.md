# Binary Serialization assistant

This library is super straightforward.

Here's how you write objects
```
FormatWriter<T> writer = new FormatWriter<T>();
writer.write(object, path);
```

And this is how you read objects
```
FormatReader<T> reader = new FormatReader<T>();
T object = reader.read(path);
```

A full, working example can be found [here](https://github.com/CodeBasePW/meridian-serial/tree/master/meridian-serial/src/me/moderator_man/meridian/serial).
