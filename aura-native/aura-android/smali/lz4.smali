.class public final Llz4;
.super Lrp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic b:Ljava/util/HashMap;

.field public final synthetic c:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llz4;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    iput-object p2, p0, Llz4;->c:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    const/4 p1, 0x6

    .line 6
    invoke-direct {p0, p1}, Lrp;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/Class;)V
    .locals 2

    .line 1
    iget-object p0, p0, Llz4;->c:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "No type mapping from "

    .line 9
    .line 10
    const-string v1, " to "

    .line 11
    .line 12
    invoke-static {v0, p1, v1, p0}, Ltb4;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final q(Ljava/lang/reflect/GenericArrayType;)V
    .locals 4

    .line 1
    iget-object v0, p0, Llz4;->c:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v0}, Lb15;->c(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v2, 0x0

    .line 17
    :goto_0
    const-string v3, "%s is not an array type."

    .line 18
    .line 19
    invoke-static {v2, v3, v0}, Lrr2;->o(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Llz4;->b:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p0, p1, v1}, Lsz4;->a(Ljava/util/HashMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final r(Ljava/lang/reflect/ParameterizedType;)V
    .locals 6

    .line 1
    iget-object v0, p0, Llz4;->c:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    const-class v1, Ljava/lang/reflect/ParameterizedType;

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object p0, p0, Llz4;->b:Ljava/util/HashMap;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {p0, v2, v3}, Lsz4;->a(Ljava/util/HashMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const-string v3, "Inconsistent raw type: %s vs. %s"

    .line 54
    .line 55
    invoke-static {v2, v3, p1, v0}, Lrr2;->p(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    array-length v3, v0

    .line 67
    array-length v4, v2

    .line 68
    const/4 v5, 0x0

    .line 69
    if-ne v3, v4, :cond_2

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move v3, v5

    .line 74
    :goto_0
    const-string v4, "%s not compatible with %s"

    .line 75
    .line 76
    invoke-static {v3, v4, p1, v1}, Lrr2;->p(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    array-length p1, v0

    .line 80
    if-ge v5, p1, :cond_3

    .line 81
    .line 82
    aget-object p1, v0, v5

    .line 83
    .line 84
    aget-object v1, v2, v5

    .line 85
    .line 86
    invoke-static {p0, p1, v1}, Lsz4;->a(Ljava/util/HashMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v5, v5, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    :goto_2
    return-void

    .line 93
    :catch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    new-instance p1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, " is not a ParameterizedType"

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0
.end method

.method public final s(Ljava/lang/reflect/TypeVariable;)V
    .locals 1

    .line 1
    new-instance v0, Lpz4;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lpz4;-><init>(Ljava/lang/reflect/TypeVariable;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Llz4;->c:Ljava/lang/reflect/Type;

    .line 7
    .line 8
    iget-object p0, p0, Llz4;->b:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final t(Ljava/lang/reflect/WildcardType;)V
    .locals 8

    .line 1
    iget-object v0, p0, Llz4;->c:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    move-object v1, v0

    .line 9
    check-cast v1, Ljava/lang/reflect/WildcardType;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {v1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    array-length v5, v2

    .line 28
    array-length v6, v3

    .line 29
    const/4 v7, 0x0

    .line 30
    if-ne v5, v6, :cond_1

    .line 31
    .line 32
    array-length v5, v4

    .line 33
    array-length v6, v1

    .line 34
    if-ne v5, v6, :cond_1

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v5, v7

    .line 39
    :goto_0
    const-string v6, "Incompatible type: %s vs. %s"

    .line 40
    .line 41
    invoke-static {v5, v6, p1, v0}, Lrr2;->p(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move p1, v7

    .line 45
    :goto_1
    array-length v0, v2

    .line 46
    iget-object v5, p0, Llz4;->b:Ljava/util/HashMap;

    .line 47
    .line 48
    if-ge p1, v0, :cond_2

    .line 49
    .line 50
    aget-object v0, v2, p1

    .line 51
    .line 52
    aget-object v6, v3, p1

    .line 53
    .line 54
    invoke-static {v5, v0, v6}, Lsz4;->a(Ljava/util/HashMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_2
    array-length p0, v4

    .line 61
    if-ge v7, p0, :cond_3

    .line 62
    .line 63
    aget-object p0, v4, v7

    .line 64
    .line 65
    aget-object p1, v1, v7

    .line 66
    .line 67
    invoke-static {v5, p0, p1}, Lsz4;->a(Ljava/util/HashMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v7, v7, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_3
    return-void
.end method
