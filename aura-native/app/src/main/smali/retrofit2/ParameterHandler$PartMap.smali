.class final Lretrofit2/ParameterHandler$PartMap;
.super Lretrofit2/ParameterHandler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/ParameterHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PartMap"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lretrofit2/ParameterHandler<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field private final method:Ljava/lang/reflect/Method;

.field private final p:I

.field private final transferEncoding:Ljava/lang/String;

.field private final valueConverter:Lretrofit2/Converter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/Converter<",
            "TT;",
            "Ldefpackage/tz3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;ILretrofit2/Converter;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "I",
            "Lretrofit2/Converter<",
            "TT;",
            "Ldefpackage/tz3;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lretrofit2/ParameterHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/ParameterHandler$PartMap;->method:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput p2, p0, Lretrofit2/ParameterHandler$PartMap;->p:I

    .line 7
    .line 8
    iput-object p3, p0, Lretrofit2/ParameterHandler$PartMap;->valueConverter:Lretrofit2/Converter;

    .line 9
    .line 10
    iput-object p4, p0, Lretrofit2/ParameterHandler$PartMap;->transferEncoding:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Lretrofit2/RequestBuilder;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 118
    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lretrofit2/ParameterHandler$PartMap;->apply(Lretrofit2/RequestBuilder;Ljava/util/Map;)V

    return-void
.end method

.method public apply(Lretrofit2/RequestBuilder;Ljava/util/Map;)V
    .locals 6
    .param p2    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/RequestBuilder;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_3

    .line 3
    .line 4
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/util/Map$Entry;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    const-string v3, "form-data; name=\""

    .line 39
    .line 40
    const-string v4, "\""

    .line 41
    .line 42
    invoke-static {v3, v2, v4}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "Content-Transfer-Encoding"

    .line 47
    .line 48
    iget-object v4, p0, Lretrofit2/ParameterHandler$PartMap;->transferEncoding:Ljava/lang/String;

    .line 49
    .line 50
    const-string v5, "Content-Disposition"

    .line 51
    .line 52
    filled-new-array {v5, v2, v3, v4}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Ldefpackage/h12;->G([Ljava/lang/String;)Ldefpackage/tl1;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v3, p0, Lretrofit2/ParameterHandler$PartMap;->valueConverter:Lretrofit2/Converter;

    .line 61
    .line 62
    invoke-interface {v3, v1}, Lretrofit2/Converter;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ldefpackage/tz3;

    .line 67
    .line 68
    invoke-virtual {p1, v2, v1}, Lretrofit2/RequestBuilder;->addPart(Ldefpackage/tl1;Ldefpackage/tz3;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iget-object p1, p0, Lretrofit2/ParameterHandler$PartMap;->method:Ljava/lang/reflect/Method;

    .line 73
    .line 74
    iget p0, p0, Lretrofit2/ParameterHandler$PartMap;->p:I

    .line 75
    .line 76
    const-string p2, "Part map contained null value for key \'"

    .line 77
    .line 78
    const-string v1, "\'."

    .line 79
    .line 80
    invoke-static {p2, v2, v1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    new-array v0, v0, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-static {p1, p0, p2, v0}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    throw p0

    .line 91
    :cond_1
    iget-object p1, p0, Lretrofit2/ParameterHandler$PartMap;->method:Ljava/lang/reflect/Method;

    .line 92
    .line 93
    iget p0, p0, Lretrofit2/ParameterHandler$PartMap;->p:I

    .line 94
    .line 95
    const-string p2, "Part map contained null key."

    .line 96
    .line 97
    new-array v0, v0, [Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {p1, p0, p2, v0}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    throw p0

    .line 104
    :cond_2
    return-void

    .line 105
    :cond_3
    iget-object p1, p0, Lretrofit2/ParameterHandler$PartMap;->method:Ljava/lang/reflect/Method;

    .line 106
    .line 107
    iget p0, p0, Lretrofit2/ParameterHandler$PartMap;->p:I

    .line 108
    .line 109
    const-string p2, "Part map was null."

    .line 110
    .line 111
    new-array v0, v0, [Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {p1, p0, p2, v0}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    throw p0
.end method
