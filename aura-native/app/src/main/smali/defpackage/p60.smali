.class public final Ldefpackage/p60;
.super Ljava/util/AbstractMap;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final w:Ljava/lang/Object;


# instance fields
.field public transient n:Ljava/lang/Object;

.field public transient o:[I

.field public transient p:[Ljava/lang/Object;

.field public transient q:[Ljava/lang/Object;

.field public transient r:I

.field public transient s:I

.field public transient t:Ldefpackage/n60;

.field public transient u:Ldefpackage/n60;

.field public transient v:Ldefpackage/s1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/p60;->w:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static a()Ldefpackage/p60;
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/p60;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/AbstractMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v1, v2}, Ldefpackage/jz4;->o(II)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iput v1, v0, Ldefpackage/p60;->r:I

    .line 13
    .line 14
    return-object v0
.end method

.method public static b(I)Ldefpackage/p60;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/p60;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/AbstractMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    move v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    :goto_0
    const-string v3, "Expected size must be >= 0"

    .line 13
    .line 14
    invoke-static {v3, v2}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1}, Ldefpackage/jz4;->o(II)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    iput p0, v0, Ldefpackage/p60;->r:I

    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Map;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/util/Map;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final clear()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Ldefpackage/p60;->r:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x20

    .line 11
    .line 12
    iput v0, p0, Ldefpackage/p60;->r:I

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/p60;->c()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/p60;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x3

    .line 27
    invoke-static {v3, v4}, Ldefpackage/jz4;->o(II)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, Ldefpackage/p60;->r:I

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 37
    .line 38
    iput v2, p0, Ldefpackage/p60;->s:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {p0}, Ldefpackage/p60;->j()[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v3, p0, Ldefpackage/p60;->s:I

    .line 46
    .line 47
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v3, p0, Ldefpackage/p60;->s:I

    .line 55
    .line 56
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    instance-of v1, v0, [B

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    check-cast v0, [B

    .line 69
    .line 70
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([BB)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    instance-of v1, v0, [S

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    check-cast v0, [S

    .line 79
    .line 80
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([SS)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    check-cast v0, [I

    .line 85
    .line 86
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 87
    .line 88
    .line 89
    :goto_0
    invoke-virtual {p0}, Ldefpackage/p60;->i()[I

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget v1, p0, Ldefpackage/p60;->s:I

    .line 94
    .line 95
    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 96
    .line 97
    .line 98
    iput v2, p0, Ldefpackage/p60;->s:I

    .line 99
    .line 100
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->c()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/p60;->e(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/4 p1, -0x1

    .line 17
    if-eq p0, p1, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->c()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    iget v2, p0, Ldefpackage/p60;->s:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    aget-object v2, v2, v1

    .line 23
    .line 24
    invoke-static {p1, v2}, Ldefpackage/si0;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget p0, p0, Ldefpackage/p60;->r:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x1f

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    shl-int p0, v0, p0

    .line 7
    .line 8
    sub-int/2addr p0, v0

    .line 9
    return p0
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {p1}, Ldefpackage/g12;->U(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Ldefpackage/p60;->d()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    and-int v4, v0, v2

    .line 23
    .line 24
    invoke-static {v4, v3}, Ldefpackage/bu;->B(ILjava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    not-int v4, v2

    .line 32
    and-int/2addr v0, v4

    .line 33
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/p60;->i()[I

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    aget v5, v5, v3

    .line 40
    .line 41
    and-int v6, v5, v4

    .line 42
    .line 43
    if-ne v6, v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Ldefpackage/p60;->j()[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    aget-object v6, v6, v3

    .line 50
    .line 51
    invoke-static {p1, v6}, Ldefpackage/si0;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    return v3

    .line 58
    :cond_3
    and-int v3, v5, v2

    .line 59
    .line 60
    if-nez v3, :cond_2

    .line 61
    .line 62
    return v1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/p60;->u:Ldefpackage/n60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/n60;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Ldefpackage/n60;-><init>(Ljava/util/Map;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/p60;->u:Ldefpackage/n60;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final f(II)V
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/p60;->i()[I

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0}, Ldefpackage/p60;->j()[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {p0}, Ldefpackage/p60;->size()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/lit8 v4, p0, -0x1

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    if-ge p1, v4, :cond_2

    .line 27
    .line 28
    aget-object v7, v2, v4

    .line 29
    .line 30
    aput-object v7, v2, p1

    .line 31
    .line 32
    aget-object v8, v3, v4

    .line 33
    .line 34
    aput-object v8, v3, p1

    .line 35
    .line 36
    aput-object v6, v2, v4

    .line 37
    .line 38
    aput-object v6, v3, v4

    .line 39
    .line 40
    aget v2, v1, v4

    .line 41
    .line 42
    aput v2, v1, p1

    .line 43
    .line 44
    aput v5, v1, v4

    .line 45
    .line 46
    invoke-static {v7}, Ldefpackage/g12;->U(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    and-int/2addr v2, p2

    .line 51
    invoke-static {v2, v0}, Ldefpackage/bu;->B(ILjava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-ne v3, p0, :cond_0

    .line 56
    .line 57
    add-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    invoke-static {v2, p1, v0}, Ldefpackage/bu;->C(IILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    :goto_0
    add-int/lit8 v3, v3, -0x1

    .line 64
    .line 65
    aget v0, v1, v3

    .line 66
    .line 67
    and-int v2, v0, p2

    .line 68
    .line 69
    if-ne v2, p0, :cond_1

    .line 70
    .line 71
    add-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    invoke-static {v0, p1, p2}, Ldefpackage/bu;->s(III)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    aput p0, v1, v3

    .line 78
    .line 79
    return-void

    .line 80
    :cond_1
    move v3, v2

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    aput-object v6, v2, p1

    .line 83
    .line 84
    aput-object v6, v3, p1

    .line 85
    .line 86
    aput v5, v1, p1

    .line 87
    .line 88
    return-void
.end method

.method public final g()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->c()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/p60;->e(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, -0x1

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-virtual {p0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    aget-object p0, p0, p1

    .line 26
    .line 27
    return-object p0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ldefpackage/p60;->d()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    iget-object v4, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/p60;->i()[I

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p0}, Ldefpackage/p60;->j()[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    move-object v1, p1

    .line 28
    invoke-static/range {v1 .. v7}, Ldefpackage/bu;->A(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 v0, -0x1

    .line 33
    if-ne p1, v0, :cond_1

    .line 34
    .line 35
    :goto_0
    sget-object p0, Ldefpackage/p60;->w:Ljava/lang/Object;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-virtual {p0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    aget-object v0, v0, p1

    .line 43
    .line 44
    invoke-virtual {p0, p1, v3}, Ldefpackage/p60;->f(II)V

    .line 45
    .line 46
    .line 47
    iget p1, p0, Ldefpackage/p60;->s:I

    .line 48
    .line 49
    add-int/lit8 p1, p1, -0x1

    .line 50
    .line 51
    iput p1, p0, Ldefpackage/p60;->s:I

    .line 52
    .line 53
    iget p1, p0, Ldefpackage/p60;->r:I

    .line 54
    .line 55
    add-int/lit8 p1, p1, 0x20

    .line 56
    .line 57
    iput p1, p0, Ldefpackage/p60;->r:I

    .line 58
    .line 59
    return-object v0
.end method

.method public final i()[I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/p60;->o:[I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p0, [I

    .line 7
    .line 8
    return-object p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final j()[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/p60;->p:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p0, [Ljava/lang/Object;

    .line 7
    .line 8
    return-object p0
.end method

.method public final k()[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/p60;->q:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p0, [Ljava/lang/Object;

    .line 7
    .line 8
    return-object p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/p60;->t:Ldefpackage/n60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/n60;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Ldefpackage/n60;-><init>(Ljava/util/Map;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/p60;->t:Ldefpackage/n60;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final l(IIII)I
    .locals 8

    .line 1
    invoke-static {p2}, Ldefpackage/bu;->g(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    add-int/lit8 p2, p2, -0x1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    and-int/2addr p3, p2

    .line 10
    add-int/lit8 p4, p4, 0x1

    .line 11
    .line 12
    invoke-static {p3, p4, v0}, Ldefpackage/bu;->C(IILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p3, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/p60;->i()[I

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-gt v1, p1, :cond_2

    .line 26
    .line 27
    invoke-static {v1, p3}, Ldefpackage/bu;->B(ILjava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    :goto_1
    if-eqz v2, :cond_1

    .line 32
    .line 33
    add-int/lit8 v3, v2, -0x1

    .line 34
    .line 35
    aget v4, p4, v3

    .line 36
    .line 37
    not-int v5, p1

    .line 38
    and-int/2addr v5, v4

    .line 39
    or-int/2addr v5, v1

    .line 40
    and-int v6, v5, p2

    .line 41
    .line 42
    invoke-static {v6, v0}, Ldefpackage/bu;->B(ILjava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    invoke-static {v6, v2, v0}, Ldefpackage/bu;->C(IILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v5, v7, p2}, Ldefpackage/bu;->s(III)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    aput v2, p4, v3

    .line 54
    .line 55
    and-int v2, v4, p1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iput-object v0, p0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    rsub-int/lit8 p1, p1, 0x20

    .line 68
    .line 69
    iget p3, p0, Ldefpackage/p60;->r:I

    .line 70
    .line 71
    const/16 p4, 0x1f

    .line 72
    .line 73
    invoke-static {p3, p1, p4}, Ldefpackage/bu;->s(III)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput p1, p0, Ldefpackage/p60;->r:I

    .line 78
    .line 79
    return p2
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Ldefpackage/p60;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v3, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Ldefpackage/p60;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const-string v5, "Arrays already allocated"

    .line 19
    .line 20
    invoke-static {v5, v3}, Ldefpackage/rr2;->v(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iget v3, v0, Ldefpackage/p60;->r:I

    .line 24
    .line 25
    add-int/lit8 v5, v3, 0x1

    .line 26
    .line 27
    const/4 v6, 0x2

    .line 28
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {v5}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    int-to-double v7, v6

    .line 37
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 38
    .line 39
    mul-double/2addr v9, v7

    .line 40
    double-to-int v7, v9

    .line 41
    if-le v5, v7, :cond_1

    .line 42
    .line 43
    shl-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    if-lez v6, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/high16 v6, 0x40000000    # 2.0f

    .line 49
    .line 50
    :cond_1
    :goto_0
    const/4 v5, 0x4

    .line 51
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-static {v5}, Ldefpackage/bu;->g(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    iput-object v6, v0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 60
    .line 61
    sub-int/2addr v5, v4

    .line 62
    invoke-static {v5}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    rsub-int/lit8 v5, v5, 0x20

    .line 67
    .line 68
    iget v6, v0, Ldefpackage/p60;->r:I

    .line 69
    .line 70
    const/16 v7, 0x1f

    .line 71
    .line 72
    invoke-static {v6, v5, v7}, Ldefpackage/bu;->s(III)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    iput v5, v0, Ldefpackage/p60;->r:I

    .line 77
    .line 78
    new-array v5, v3, [I

    .line 79
    .line 80
    iput-object v5, v0, Ldefpackage/p60;->o:[I

    .line 81
    .line 82
    new-array v5, v3, [Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v5, v0, Ldefpackage/p60;->p:[Ljava/lang/Object;

    .line 85
    .line 86
    new-array v3, v3, [Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v3, v0, Ldefpackage/p60;->q:[Ljava/lang/Object;

    .line 89
    .line 90
    :cond_2
    invoke-virtual {v0}, Ldefpackage/p60;->c()Ljava/util/Map;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    return-object v0

    .line 101
    :cond_3
    invoke-virtual {v0}, Ldefpackage/p60;->i()[I

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0}, Ldefpackage/p60;->j()[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    iget v7, v0, Ldefpackage/p60;->s:I

    .line 114
    .line 115
    add-int/lit8 v8, v7, 0x1

    .line 116
    .line 117
    invoke-static {v1}, Ldefpackage/g12;->U(Ljava/lang/Object;)I

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    invoke-virtual {v0}, Ldefpackage/p60;->d()I

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    and-int v11, v9, v10

    .line 126
    .line 127
    iget-object v12, v0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    invoke-static {v11, v12}, Ldefpackage/bu;->B(ILjava/lang/Object;)I

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    if-nez v12, :cond_5

    .line 137
    .line 138
    if-le v8, v10, :cond_4

    .line 139
    .line 140
    invoke-static {v10}, Ldefpackage/bu;->t(I)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-virtual {v0, v10, v3, v9, v7}, Ldefpackage/p60;->l(IIII)I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    :goto_1
    move/from16 v17, v4

    .line 149
    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :cond_4
    iget-object v3, v0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 153
    .line 154
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    invoke-static {v11, v8, v3}, Ldefpackage/bu;->C(IILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_5
    not-int v11, v10

    .line 162
    and-int v15, v9, v11

    .line 163
    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    :goto_2
    sub-int/2addr v12, v4

    .line 167
    aget v14, v3, v12

    .line 168
    .line 169
    move/from16 v17, v4

    .line 170
    .line 171
    and-int v4, v14, v11

    .line 172
    .line 173
    if-ne v4, v15, :cond_6

    .line 174
    .line 175
    aget-object v4, v5, v12

    .line 176
    .line 177
    invoke-static {v1, v4}, Ldefpackage/si0;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_6

    .line 182
    .line 183
    aget-object v0, v6, v12

    .line 184
    .line 185
    aput-object v2, v6, v12

    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_6
    and-int v4, v14, v10

    .line 189
    .line 190
    add-int/lit8 v13, v16, 0x1

    .line 191
    .line 192
    if-nez v4, :cond_d

    .line 193
    .line 194
    const/16 v4, 0x9

    .line 195
    .line 196
    if-lt v13, v4, :cond_a

    .line 197
    .line 198
    invoke-virtual {v0}, Ldefpackage/p60;->d()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    add-int/lit8 v3, v3, 0x1

    .line 203
    .line 204
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 205
    .line 206
    const/high16 v5, 0x3f800000    # 1.0f

    .line 207
    .line 208
    invoke-direct {v4, v3, v5}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Ldefpackage/p60;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    const/4 v5, -0x1

    .line 216
    if-eqz v3, :cond_8

    .line 217
    .line 218
    :cond_7
    move v14, v5

    .line 219
    goto :goto_3

    .line 220
    :cond_8
    const/4 v14, 0x0

    .line 221
    :goto_3
    if-ltz v14, :cond_9

    .line 222
    .line 223
    invoke-virtual {v0}, Ldefpackage/p60;->j()[Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    aget-object v3, v3, v14

    .line 228
    .line 229
    invoke-virtual {v0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    aget-object v6, v6, v14

    .line 234
    .line 235
    invoke-interface {v4, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    add-int/lit8 v14, v14, 0x1

    .line 239
    .line 240
    iget v3, v0, Ldefpackage/p60;->s:I

    .line 241
    .line 242
    if-ge v14, v3, :cond_7

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_9
    iput-object v4, v0, Ldefpackage/p60;->n:Ljava/lang/Object;

    .line 246
    .line 247
    const/4 v3, 0x0

    .line 248
    iput-object v3, v0, Ldefpackage/p60;->o:[I

    .line 249
    .line 250
    iput-object v3, v0, Ldefpackage/p60;->p:[Ljava/lang/Object;

    .line 251
    .line 252
    iput-object v3, v0, Ldefpackage/p60;->q:[Ljava/lang/Object;

    .line 253
    .line 254
    iget v3, v0, Ldefpackage/p60;->r:I

    .line 255
    .line 256
    add-int/lit8 v3, v3, 0x20

    .line 257
    .line 258
    iput v3, v0, Ldefpackage/p60;->r:I

    .line 259
    .line 260
    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    return-object v0

    .line 265
    :cond_a
    if-le v8, v10, :cond_b

    .line 266
    .line 267
    invoke-static {v10}, Ldefpackage/bu;->t(I)I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    invoke-virtual {v0, v10, v3, v9, v7}, Ldefpackage/p60;->l(IIII)I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    goto :goto_4

    .line 276
    :cond_b
    invoke-static {v14, v8, v10}, Ldefpackage/bu;->s(III)I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    aput v4, v3, v12

    .line 281
    .line 282
    :goto_4
    invoke-virtual {v0}, Ldefpackage/p60;->i()[I

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    array-length v3, v3

    .line 287
    if-le v8, v3, :cond_c

    .line 288
    .line 289
    ushr-int/lit8 v4, v3, 0x1

    .line 290
    .line 291
    move/from16 v12, v17

    .line 292
    .line 293
    invoke-static {v12, v4}, Ljava/lang/Math;->max(II)I

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    add-int/2addr v4, v3

    .line 298
    or-int/2addr v4, v12

    .line 299
    const v5, 0x3fffffff    # 1.9999999f

    .line 300
    .line 301
    .line 302
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-eq v4, v3, :cond_c

    .line 307
    .line 308
    invoke-virtual {v0}, Ldefpackage/p60;->i()[I

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    iput-object v3, v0, Ldefpackage/p60;->o:[I

    .line 317
    .line 318
    invoke-virtual {v0}, Ldefpackage/p60;->j()[Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    iput-object v3, v0, Ldefpackage/p60;->p:[Ljava/lang/Object;

    .line 327
    .line 328
    invoke-virtual {v0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    iput-object v3, v0, Ldefpackage/p60;->q:[Ljava/lang/Object;

    .line 337
    .line 338
    :cond_c
    const/4 v14, 0x0

    .line 339
    invoke-static {v9, v14, v10}, Ldefpackage/bu;->s(III)I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    invoke-virtual {v0}, Ldefpackage/p60;->i()[I

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    aput v3, v4, v7

    .line 348
    .line 349
    invoke-virtual {v0}, Ldefpackage/p60;->j()[Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    aput-object v1, v3, v7

    .line 354
    .line 355
    invoke-virtual {v0}, Ldefpackage/p60;->k()[Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    aput-object v2, v1, v7

    .line 360
    .line 361
    iput v8, v0, Ldefpackage/p60;->s:I

    .line 362
    .line 363
    iget v1, v0, Ldefpackage/p60;->r:I

    .line 364
    .line 365
    add-int/lit8 v1, v1, 0x20

    .line 366
    .line 367
    iput v1, v0, Ldefpackage/p60;->r:I

    .line 368
    .line 369
    const/16 v18, 0x0

    .line 370
    .line 371
    return-object v18

    .line 372
    :cond_d
    const/16 v18, 0x0

    .line 373
    .line 374
    move v12, v4

    .line 375
    move/from16 v16, v13

    .line 376
    .line 377
    move/from16 v4, v17

    .line 378
    .line 379
    goto/16 :goto_2
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->c()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/p60;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Ldefpackage/p60;->w:Ljava/lang/Object;

    .line 17
    .line 18
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_1
    return-object p0
.end method

.method public final size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/p60;->c()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget p0, p0, Ldefpackage/p60;->s:I

    .line 13
    .line 14
    return p0
.end method

.method public final values()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/p60;->v:Ldefpackage/s1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/s1;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1, p0}, Ldefpackage/s1;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/p60;->v:Ldefpackage/s1;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    return-void
.end method
