.class final Lretrofit2/converter/gson/GsonRequestBodyConverter;
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
        "TT;",
        "Ldefpackage/tz3;",
        ">;"
    }
.end annotation


# static fields
.field private static final MEDIA_TYPE:Ldefpackage/hu2;


# instance fields
.field private final adapter:Ldefpackage/bz4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/bz4;"
        }
    .end annotation
.end field

.field private final gson:Ldefpackage/nk1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "application/json; charset=UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lretrofit2/converter/gson/GsonRequestBodyConverter;->MEDIA_TYPE:Ldefpackage/hu2;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldefpackage/nk1;Ldefpackage/bz4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/nk1;",
            "Ldefpackage/bz4;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/converter/gson/GsonRequestBodyConverter;->gson:Ldefpackage/nk1;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/converter/gson/GsonRequestBodyConverter;->adapter:Ldefpackage/bz4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 45
    invoke-virtual {p0, p1}, Lretrofit2/converter/gson/GsonRequestBodyConverter;->convert(Ljava/lang/Object;)Ldefpackage/tz3;

    move-result-object p0

    return-object p0
.end method

.method public convert(Ljava/lang/Object;)Ldefpackage/tz3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ldefpackage/tz3;"
        }
    .end annotation

    .line 1
    new-instance v0, Ldefpackage/tv;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 7
    .line 8
    new-instance v2, Ldefpackage/sv;

    .line 9
    .line 10
    invoke-direct {v2, v0}, Ldefpackage/sv;-><init>(Ldefpackage/tv;)V

    .line 11
    .line 12
    .line 13
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lretrofit2/converter/gson/GsonRequestBodyConverter;->gson:Ldefpackage/nk1;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ldefpackage/nk1;->i(Ljava/io/Writer;)Ldefpackage/q32;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object p0, p0, Lretrofit2/converter/gson/GsonRequestBodyConverter;->adapter:Ldefpackage/bz4;

    .line 25
    .line 26
    invoke-virtual {p0, v1, p1}, Ldefpackage/bz4;->b(Ldefpackage/q32;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ldefpackage/q32;->close()V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lretrofit2/converter/gson/GsonRequestBodyConverter;->MEDIA_TYPE:Ldefpackage/hu2;

    .line 33
    .line 34
    iget-wide v1, v0, Ldefpackage/tv;->o:J

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Ldefpackage/tv;->g(J)Ldefpackage/yw;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p0, p1}, Ldefpackage/tz3;->create(Ldefpackage/hu2;Ldefpackage/yw;)Ldefpackage/tz3;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
