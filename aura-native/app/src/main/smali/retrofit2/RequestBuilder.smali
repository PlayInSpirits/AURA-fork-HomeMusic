.class final Lretrofit2/RequestBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;
    }
.end annotation


# static fields
.field private static final HEX_DIGITS:[C

.field private static final PATH_SEGMENT_ALWAYS_ENCODE_SET:Ljava/lang/String; = " \"<>^`{}|\\?#"

.field private static final PATH_TRAVERSAL:Ljava/util/regex/Pattern;


# instance fields
.field private final baseUrl:Ldefpackage/gr1;

.field private body:Ldefpackage/tz3;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private contentType:Ldefpackage/hu2;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private formBuilder:Ldefpackage/qb1;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final hasBody:Z

.field private final headersBuilder:Ldefpackage/sl1;

.field private final method:Ljava/lang/String;

.field private multipartBuilder:Ldefpackage/uz2;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private relativeUrl:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final requestBuilder:Ldefpackage/nz3;

.field private urlBuilder:Ldefpackage/fr1;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lretrofit2/RequestBuilder;->HEX_DIGITS:[C

    .line 9
    .line 10
    const-string v0, "(.*/)?(\\.|%2e|%2E){1,2}(/.*)?"

    .line 11
    .line 12
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lretrofit2/RequestBuilder;->PATH_TRAVERSAL:Ljava/util/regex/Pattern;

    .line 17
    .line 18
    return-void

    .line 19
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ldefpackage/gr1;Ljava/lang/String;Ldefpackage/tl1;Ldefpackage/hu2;ZZZ)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ldefpackage/tl1;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ldefpackage/hu2;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/RequestBuilder;->method:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/RequestBuilder;->baseUrl:Ldefpackage/gr1;

    .line 7
    .line 8
    iput-object p3, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 9
    .line 10
    new-instance p1, Ldefpackage/nz3;

    .line 11
    .line 12
    invoke-direct {p1}, Ldefpackage/nz3;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lretrofit2/RequestBuilder;->requestBuilder:Ldefpackage/nz3;

    .line 16
    .line 17
    iput-object p5, p0, Lretrofit2/RequestBuilder;->contentType:Ldefpackage/hu2;

    .line 18
    .line 19
    iput-boolean p6, p0, Lretrofit2/RequestBuilder;->hasBody:Z

    .line 20
    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p4}, Ldefpackage/tl1;->d()Ldefpackage/sl1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lretrofit2/RequestBuilder;->headersBuilder:Ldefpackage/sl1;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ldefpackage/sl1;

    .line 31
    .line 32
    invoke-direct {p1}, Ldefpackage/sl1;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lretrofit2/RequestBuilder;->headersBuilder:Ldefpackage/sl1;

    .line 36
    .line 37
    :goto_0
    if-eqz p7, :cond_1

    .line 38
    .line 39
    new-instance p1, Ldefpackage/qb1;

    .line 40
    .line 41
    invoke-direct {p1}, Ldefpackage/qb1;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lretrofit2/RequestBuilder;->formBuilder:Ldefpackage/qb1;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    if-eqz p8, :cond_2

    .line 48
    .line 49
    new-instance p1, Ldefpackage/uz2;

    .line 50
    .line 51
    invoke-direct {p1}, Ldefpackage/uz2;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lretrofit2/RequestBuilder;->multipartBuilder:Ldefpackage/uz2;

    .line 55
    .line 56
    sget-object p0, Ldefpackage/wz2;->f:Ldefpackage/hu2;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ldefpackage/uz2;->c(Ldefpackage/hu2;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method private static canonicalizeForPath(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 6

    .line 110
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    .line 111
    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    const/16 v4, 0x20

    if-lt v3, v4, :cond_1

    const/16 v4, 0x7f

    if-ge v3, v4, :cond_1

    .line 112
    const-string v4, " \"<>^`{}|\\?#"

    .line 113
    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    if-nez p1, :cond_0

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    const/16 v4, 0x25

    if-ne v3, v4, :cond_0

    goto :goto_1

    .line 114
    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    .line 115
    :cond_1
    :goto_1
    new-instance v3, Ldefpackage/tv;

    .line 116
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 117
    invoke-virtual {v3, p0, v1, v2}, Ldefpackage/tv;->e0(Ljava/lang/String;II)V

    .line 118
    invoke-static {v3, p0, v2, v0, p1}, Lretrofit2/RequestBuilder;->canonicalizeForPath(Ldefpackage/tv;Ljava/lang/String;IIZ)V

    .line 119
    invoke-virtual {v3}, Ldefpackage/tv;->M()Ljava/lang/String;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method private static canonicalizeForPath(Ldefpackage/tv;Ljava/lang/String;IIZ)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge p2, p3, :cond_5

    .line 3
    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    if-eq v1, v2, :cond_4

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    if-eq v1, v2, :cond_4

    .line 17
    .line 18
    const/16 v2, 0xc

    .line 19
    .line 20
    if-eq v1, v2, :cond_4

    .line 21
    .line 22
    const/16 v2, 0xd

    .line 23
    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_0
    const/16 v2, 0x20

    .line 28
    .line 29
    const/16 v3, 0x25

    .line 30
    .line 31
    if-lt v1, v2, :cond_2

    .line 32
    .line 33
    const/16 v2, 0x7f

    .line 34
    .line 35
    if-ge v1, v2, :cond_2

    .line 36
    .line 37
    const-string v2, " \"<>^`{}|\\?#"

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/String;->indexOf(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v4, -0x1

    .line 44
    if-ne v2, v4, :cond_2

    .line 45
    .line 46
    if-nez p4, :cond_1

    .line 47
    .line 48
    const/16 v2, 0x2f

    .line 49
    .line 50
    if-eq v1, v2, :cond_2

    .line 51
    .line 52
    if-ne v1, v3, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {p0, v1}, Ldefpackage/tv;->f0(I)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    :goto_1
    if-nez v0, :cond_3

    .line 60
    .line 61
    new-instance v0, Ldefpackage/tv;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-virtual {v0, v1}, Ldefpackage/tv;->f0(I)V

    .line 67
    .line 68
    .line 69
    :goto_2
    invoke-virtual {v0}, Ldefpackage/tv;->l()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    invoke-virtual {v0}, Ldefpackage/tv;->readByte()B

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    and-int/lit16 v4, v2, 0xff

    .line 80
    .line 81
    invoke-virtual {p0, v3}, Ldefpackage/tv;->Y(I)V

    .line 82
    .line 83
    .line 84
    sget-object v5, Lretrofit2/RequestBuilder;->HEX_DIGITS:[C

    .line 85
    .line 86
    shr-int/lit8 v4, v4, 0x4

    .line 87
    .line 88
    and-int/lit8 v4, v4, 0xf

    .line 89
    .line 90
    aget-char v4, v5, v4

    .line 91
    .line 92
    invoke-virtual {p0, v4}, Ldefpackage/tv;->Y(I)V

    .line 93
    .line 94
    .line 95
    and-int/lit8 v2, v2, 0xf

    .line 96
    .line 97
    aget-char v2, v5, v2

    .line 98
    .line 99
    invoke-virtual {p0, v2}, Ldefpackage/tv;->Y(I)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    :goto_3
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    add-int/2addr p2, v1

    .line 108
    goto :goto_0

    .line 109
    :cond_5
    return-void
.end method


# virtual methods
.method public addFormField(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 1
    iget-object p0, p0, Lretrofit2/RequestBuilder;->formBuilder:Ldefpackage/qb1;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p3, p0, Ldefpackage/qb1;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/16 v8, 0x53

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const-string v3, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x1

    .line 26
    move-object v0, p1

    .line 27
    invoke-static/range {v0 .. v8}, Ldefpackage/fu;->i(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/qb1;->b:Ljava/util/ArrayList;

    .line 35
    .line 36
    const-string v3, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 37
    .line 38
    move-object v0, p2

    .line 39
    invoke-static/range {v0 .. v8}, Ldefpackage/fu;->i(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    move-object v0, p1

    .line 48
    move-object p1, p2

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object p2, p0, Ldefpackage/qb1;->a:Ljava/util/ArrayList;

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    const/16 v8, 0x5b

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    const/4 v2, 0x0

    .line 65
    const-string v3, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    invoke-static/range {v0 .. v8}, Ldefpackage/fu;->i(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, Ldefpackage/qb1;->b:Ljava/util/ArrayList;

    .line 78
    .line 79
    const-string v3, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 80
    .line 81
    move-object v0, p1

    .line 82
    invoke-static/range {v0 .. v8}, Ldefpackage/fu;->i(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public addHeader(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, "Content-Type"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lretrofit2/RequestBuilder;->contentType:Ldefpackage/hu2;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p0

    .line 20
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string p3, "Malformed content type: "

    .line 23
    .line 24
    invoke-static {p3, p2}, Ldefpackage/xa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_0
    iget-object p0, p0, Lretrofit2/RequestBuilder;->headersBuilder:Ldefpackage/sl1;

    .line 33
    .line 34
    if-eqz p3, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Ldefpackage/e35;->G(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1, p2}, Ldefpackage/e35;->p(Ldefpackage/sl1;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    invoke-virtual {p0, p1, p2}, Ldefpackage/sl1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public addHeaders(Ldefpackage/tl1;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lretrofit2/RequestBuilder;->headersBuilder:Ldefpackage/sl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ldefpackage/tl1;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ldefpackage/tl1;->b(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1, v1}, Ldefpackage/tl1;->e(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {p0, v2, v3}, Ldefpackage/e35;->p(Ldefpackage/sl1;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public addPart(Ldefpackage/tl1;Ldefpackage/tz3;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lretrofit2/RequestBuilder;->multipartBuilder:Ldefpackage/uz2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const-string v1, "Content-Type"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v0

    .line 20
    :goto_0
    if-nez v1, :cond_3

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const-string v0, "Content-Length"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    if-nez v0, :cond_2

    .line 31
    .line 32
    new-instance v0, Ldefpackage/vz2;

    .line 33
    .line 34
    invoke-direct {v0, p1, p2}, Ldefpackage/vz2;-><init>(Ldefpackage/tl1;Ldefpackage/tz3;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Ldefpackage/uz2;->c:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    const-string p0, "Unexpected header: Content-Length"

    .line 44
    .line 45
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    const-string p0, "Unexpected header: Content-Type"

    .line 50
    .line 51
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public addPart(Ldefpackage/vz2;)V
    .locals 0

    .line 55
    iget-object p0, p0, Lretrofit2/RequestBuilder;->multipartBuilder:Ldefpackage/uz2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    iget-object p0, p0, Ldefpackage/uz2;->c:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addPathParam(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p2, p3}, Lretrofit2/RequestBuilder;->canonicalizeForPath(Ljava/lang/String;Z)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    iget-object v0, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "{"

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, "}"

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p3, Lretrofit2/RequestBuilder;->PATH_TRAVERSAL:Ljava/util/regex/Pattern;

    .line 35
    .line 36
    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {p3}, Ljava/util/regex/Matcher;->matches()Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-nez p3, :cond_0

    .line 45
    .line 46
    iput-object p1, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p0, "@Path parameters shouldn\'t perform path traversal (\'.\' or \'..\'): "

    .line 50
    .line 51
    invoke-static {p0, p2}, Ldefpackage/xa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p0
.end method

.method public addQueryParam(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lretrofit2/RequestBuilder;->baseUrl:Ldefpackage/gr1;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    :try_start_0
    new-instance v3, Ldefpackage/fr1;

    .line 12
    .line 13
    invoke-direct {v3}, Ldefpackage/fr1;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v2, v0}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-object v3, v1

    .line 21
    :goto_0
    iput-object v3, p0, Lretrofit2/RequestBuilder;->urlBuilder:Ldefpackage/fr1;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iput-object v1, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string p3, "Malformed URL. Base: "

    .line 33
    .line 34
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p3, p0, Lretrofit2/RequestBuilder;->baseUrl:Ldefpackage/gr1;

    .line 38
    .line 39
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 43
    .line 44
    const-string p3, ", Relative: "

    .line 45
    .line 46
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_1
    :goto_1
    iget-object p0, p0, Lretrofit2/RequestBuilder;->urlBuilder:Ldefpackage/fr1;

    .line 61
    .line 62
    if-eqz p3, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p3, p0, Ldefpackage/fr1;->g:Ljava/util/ArrayList;

    .line 71
    .line 72
    if-nez p3, :cond_2

    .line 73
    .line 74
    new-instance p3, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p3, p0, Ldefpackage/fr1;->g:Ljava/util/ArrayList;

    .line 80
    .line 81
    :cond_2
    iget-object p3, p0, Ldefpackage/fr1;->g:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    const-string v2, " \"\'<>#&="

    .line 88
    .line 89
    const/16 v3, 0x53

    .line 90
    .line 91
    invoke-static {p1, v0, v0, v2, v3}, Ldefpackage/fu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, Ldefpackage/fr1;->g:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    if-eqz p2, :cond_3

    .line 104
    .line 105
    invoke-static {p2, v0, v0, v2, v3}, Ldefpackage/fu;->g(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :cond_3
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    invoke-virtual {p0, p1, p2}, Ldefpackage/fr1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public addTag(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lretrofit2/RequestBuilder;->requestBuilder:Ldefpackage/nz3;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ldefpackage/nz3;->c(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public get()Ldefpackage/nz3;
    .locals 5

    .line 1
    iget-object v0, p0, Lretrofit2/RequestBuilder;->urlBuilder:Ldefpackage/fr1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_2

    .line 11
    :cond_0
    iget-object v0, p0, Lretrofit2/RequestBuilder;->baseUrl:Ldefpackage/gr1;

    .line 12
    .line 13
    iget-object v2, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    :try_start_0
    new-instance v3, Ldefpackage/fr1;

    .line 22
    .line 23
    invoke-direct {v3}, Ldefpackage/fr1;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v0, v2}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-object v3, v1

    .line 31
    :goto_0
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v0, v1

    .line 39
    :goto_1
    if-eqz v0, :cond_7

    .line 40
    .line 41
    :goto_2
    iget-object v2, p0, Lretrofit2/RequestBuilder;->body:Ldefpackage/tz3;

    .line 42
    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    iget-object v3, p0, Lretrofit2/RequestBuilder;->formBuilder:Ldefpackage/qb1;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    new-instance v2, Ldefpackage/rb1;

    .line 50
    .line 51
    iget-object v1, v3, Ldefpackage/qb1;->a:Ljava/util/ArrayList;

    .line 52
    .line 53
    iget-object v3, v3, Ldefpackage/qb1;->b:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v2, v1, v3}, Ldefpackage/rb1;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    iget-object v3, p0, Lretrofit2/RequestBuilder;->multipartBuilder:Ldefpackage/uz2;

    .line 60
    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    invoke-virtual {v3}, Ldefpackage/uz2;->b()Ldefpackage/wz2;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    iget-boolean v3, p0, Lretrofit2/RequestBuilder;->hasBody:Z

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    new-array v2, v2, [B

    .line 74
    .line 75
    invoke-static {v1, v2}, Ldefpackage/tz3;->create(Ldefpackage/hu2;[B)Ldefpackage/tz3;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    :cond_4
    :goto_3
    iget-object v1, p0, Lretrofit2/RequestBuilder;->contentType:Ldefpackage/hu2;

    .line 80
    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    if-eqz v2, :cond_5

    .line 84
    .line 85
    new-instance v3, Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;

    .line 86
    .line 87
    invoke-direct {v3, v2, v1}, Lretrofit2/RequestBuilder$ContentTypeOverridingRequestBody;-><init>(Ldefpackage/tz3;Ldefpackage/hu2;)V

    .line 88
    .line 89
    .line 90
    move-object v2, v3

    .line 91
    goto :goto_4

    .line 92
    :cond_5
    iget-object v3, p0, Lretrofit2/RequestBuilder;->headersBuilder:Ldefpackage/sl1;

    .line 93
    .line 94
    const-string v4, "Content-Type"

    .line 95
    .line 96
    iget-object v1, v1, Ldefpackage/hu2;->a:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v3, v4, v1}, Ldefpackage/sl1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_6
    :goto_4
    iget-object v1, p0, Lretrofit2/RequestBuilder;->requestBuilder:Ldefpackage/nz3;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iput-object v0, v1, Ldefpackage/nz3;->a:Ldefpackage/gr1;

    .line 107
    .line 108
    iget-object v0, p0, Lretrofit2/RequestBuilder;->headersBuilder:Ldefpackage/sl1;

    .line 109
    .line 110
    invoke-virtual {v0}, Ldefpackage/sl1;->c()Ldefpackage/tl1;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ldefpackage/tl1;->d()Ldefpackage/sl1;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, v1, Ldefpackage/nz3;->c:Ldefpackage/sl1;

    .line 119
    .line 120
    iget-object p0, p0, Lretrofit2/RequestBuilder;->method:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v1, p0, v2}, Ldefpackage/nz3;->b(Ljava/lang/String;Ldefpackage/tz3;)V

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 127
    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v2, "Malformed URL. Base: "

    .line 131
    .line 132
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, p0, Lretrofit2/RequestBuilder;->baseUrl:Ldefpackage/gr1;

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 141
    .line 142
    const-string v2, ", Relative: "

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0
.end method

.method public setBody(Ldefpackage/tz3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lretrofit2/RequestBuilder;->body:Ldefpackage/tz3;

    .line 2
    .line 3
    return-void
.end method

.method public setRelativeUrl(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lretrofit2/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method
