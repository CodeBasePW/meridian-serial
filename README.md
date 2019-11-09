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

A full, working example can be found [here](../blob/master/meridian-serial/meridian-serial/src/me/moderator_man/meridian/serial/example).
