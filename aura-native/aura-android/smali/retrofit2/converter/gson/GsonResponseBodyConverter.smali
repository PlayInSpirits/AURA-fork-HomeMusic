.class final Lretrofit2/converter/gson/GsonResponseBodyConverter;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Converter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lretrofit2/Converter<",
        "Ln14;",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final adapter:Lbz4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbz4;"
        }
    .end annotation
.end field

.field private final gson:Lnk1;


# direct methods
.method public constructor <init>(Lnk1;Lbz4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnk1;",
            "Lbz4;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/converter/gson/GsonResponseBodyConverter;->gson:Lnk1;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/converter/gson/GsonResponseBodyConverter;->adapter:Lbz4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 50
    check-cast p1, Ln14;

    invoke-virtual {p0, p1}, Lretrofit2/converter/gson/GsonResponseBodyConverter;->convert(Ln14;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public convert(Ln14;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln14;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lretrofit2/converter/gson/GsonResponseBodyConverter;->gson:Lnk1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ln14;->charStream()Ljava/io/Reader;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, Ll32;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Ll32;-><init>(Ljava/io/Reader;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, v0, Lnk1;->g:Z

    .line 16
    .line 17
    iput-boolean v0, v2, Ll32;->o:Z

    .line 18
    .line 19
    :try_start_0
    iget-object p0, p0, Lretrofit2/converter/gson/GsonResponseBodyConverter;->adapter:Lbz4;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v2}, Ll32;->e0()I

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const/16 v1, 0xa

    .line 30
    .line 31
    if-ne v0, v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Ln14;->close()V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    :try_start_1
    new-instance p0, Lcom/google/gson/JsonIOException;

    .line 38
    .line 39
    const-string v0, "JSON document was not fully consumed."

    .line 40
    .line 41
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    invoke-virtual {p1}, Ln14;->close()V

    .line 47
    .line 48
    .line 49
    throw p0
.end method
