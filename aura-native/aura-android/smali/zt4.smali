.class public final Lzt4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:J

.field public e:J

.field public f:Z

.field public g:Lz5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x24

    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lzt4;->h:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lzt4;->i:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lzt4;->j:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lzt4;->k:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lzt4;->l:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lz5;->f:Lz5;

    .line 5
    .line 6
    iput-object v0, p0, Lzt4;->g:Lz5;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(II)J
    .locals 1

    .line 1
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz5;->a(I)Lx5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p1, p0, Lx5;->b:I

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lx5;->g:[J

    .line 13
    .line 14
    aget-wide p1, p0, p2

    .line 15
    .line 16
    return-wide p1

    .line 17
    :cond_0
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide p0
.end method

.method public final b(J)I
    .locals 10

    .line 1
    iget-object v0, p0, Lzt4;->g:Lz5;

    .line 2
    .line 3
    iget-wide v1, p0, Lzt4;->d:J

    .line 4
    .line 5
    iget p0, v0, Lz5;->a:I

    .line 6
    .line 7
    const-wide/high16 v3, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v5, p1, v3

    .line 10
    .line 11
    const/4 v6, -0x1

    .line 12
    if-eqz v5, :cond_5

    .line 13
    .line 14
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v5, v1, v7

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    cmp-long v7, p1, v1

    .line 24
    .line 25
    if-ltz v7, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    iget v7, v0, Lz5;->d:I

    .line 29
    .line 30
    :goto_0
    if-ge v7, p0, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0, v7}, Lz5;->a(I)Lx5;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    iget-wide v8, v8, Lx5;->a:J

    .line 37
    .line 38
    cmp-long v8, v8, v3

    .line 39
    .line 40
    if-eqz v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, v7}, Lz5;->a(I)Lx5;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    iget-wide v8, v8, Lx5;->a:J

    .line 47
    .line 48
    cmp-long v8, v8, p1

    .line 49
    .line 50
    if-lez v8, :cond_2

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v0, v7}, Lz5;->a(I)Lx5;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    iget v9, v8, Lx5;->b:I

    .line 57
    .line 58
    if-eq v9, v6, :cond_3

    .line 59
    .line 60
    invoke-virtual {v8, v6}, Lx5;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-ge v8, v9, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    :goto_1
    if-ge v7, p0, :cond_5

    .line 71
    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0, v7}, Lz5;->a(I)Lx5;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-wide p0, p0, Lx5;->a:J

    .line 79
    .line 80
    cmp-long p0, p0, v1

    .line 81
    .line 82
    if-gtz p0, :cond_5

    .line 83
    .line 84
    :cond_4
    return v7

    .line 85
    :cond_5
    :goto_2
    return v6
.end method

.method public final c(J)I
    .locals 13

    .line 1
    iget-object v0, p0, Lzt4;->g:Lz5;

    .line 2
    .line 3
    iget-wide v1, p0, Lzt4;->d:J

    .line 4
    .line 5
    iget p0, v0, Lz5;->a:I

    .line 6
    .line 7
    add-int/lit8 v3, p0, -0x1

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    sub-int/2addr p0, v4

    .line 11
    const/4 v5, 0x0

    .line 12
    const-wide/high16 v6, -0x8000000000000000L

    .line 13
    .line 14
    const/4 v8, -0x1

    .line 15
    if-ne v3, p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Lz5;->a(I)Lx5;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-boolean v9, p0, Lx5;->l:Z

    .line 22
    .line 23
    if-eqz v9, :cond_0

    .line 24
    .line 25
    iget-wide v9, p0, Lx5;->a:J

    .line 26
    .line 27
    cmp-long v9, v9, v6

    .line 28
    .line 29
    if-nez v9, :cond_0

    .line 30
    .line 31
    iget p0, p0, Lx5;->b:I

    .line 32
    .line 33
    if-ne p0, v8, :cond_0

    .line 34
    .line 35
    move p0, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move p0, v5

    .line 38
    :goto_0
    sub-int/2addr v3, p0

    .line 39
    :goto_1
    if-ltz v3, :cond_5

    .line 40
    .line 41
    cmp-long p0, p1, v6

    .line 42
    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    invoke-virtual {v0, v3}, Lz5;->a(I)Lx5;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iget-wide v9, p0, Lx5;->a:J

    .line 51
    .line 52
    cmp-long v11, v9, v6

    .line 53
    .line 54
    if-nez v11, :cond_3

    .line 55
    .line 56
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    cmp-long v11, v1, v11

    .line 62
    .line 63
    if-eqz v11, :cond_4

    .line 64
    .line 65
    iget-boolean v11, p0, Lx5;->l:Z

    .line 66
    .line 67
    if-eqz v11, :cond_2

    .line 68
    .line 69
    cmp-long v9, v9, v6

    .line 70
    .line 71
    if-nez v9, :cond_2

    .line 72
    .line 73
    iget p0, p0, Lx5;->b:I

    .line 74
    .line 75
    if-ne p0, v8, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    cmp-long p0, p1, v1

    .line 79
    .line 80
    if-gez p0, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    cmp-long p0, p1, v9

    .line 84
    .line 85
    if-gez p0, :cond_5

    .line 86
    .line 87
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, -0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    :goto_3
    if-ltz v3, :cond_9

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Lz5;->a(I)Lx5;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iget p1, p0, Lx5;->b:I

    .line 97
    .line 98
    if-ne p1, v8, :cond_6

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_6
    :goto_4
    if-ge v5, p1, :cond_9

    .line 102
    .line 103
    iget-object p2, p0, Lx5;->f:[I

    .line 104
    .line 105
    aget p2, p2, v5

    .line 106
    .line 107
    if-eqz p2, :cond_8

    .line 108
    .line 109
    if-ne p2, v4, :cond_7

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_8
    :goto_5
    return v3

    .line 116
    :cond_9
    return v8
.end method

.method public final d(I)J
    .locals 0

    .line 1
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz5;->a(I)Lx5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-wide p0, p0, Lx5;->a:J

    .line 8
    .line 9
    return-wide p0
.end method

.method public final e(II)I
    .locals 1

    .line 1
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz5;->a(I)Lx5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p1, p0, Lx5;->b:I

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lx5;->f:[I

    .line 13
    .line 14
    aget p0, p0, p2

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lzt4;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    check-cast p1, Lzt4;

    .line 22
    .line 23
    iget-object v2, p0, Lzt4;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v3, p1, Lzt4;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lzt4;->b:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v3, p1, Lzt4;->b:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    iget v2, p0, Lzt4;->c:I

    .line 44
    .line 45
    iget v3, p1, Lzt4;->c:I

    .line 46
    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    iget-wide v2, p0, Lzt4;->d:J

    .line 50
    .line 51
    iget-wide v4, p1, Lzt4;->d:J

    .line 52
    .line 53
    cmp-long v2, v2, v4

    .line 54
    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    iget-wide v2, p0, Lzt4;->e:J

    .line 58
    .line 59
    iget-wide v4, p1, Lzt4;->e:J

    .line 60
    .line 61
    cmp-long v2, v2, v4

    .line 62
    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    iget-boolean v2, p0, Lzt4;->f:Z

    .line 66
    .line 67
    iget-boolean v3, p1, Lzt4;->f:Z

    .line 68
    .line 69
    if-ne v2, v3, :cond_2

    .line 70
    .line 71
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 72
    .line 73
    iget-object p1, p1, Lzt4;->g:Lz5;

    .line 74
    .line 75
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    return v0

    .line 82
    :cond_2
    :goto_0
    return v1
.end method

.method public final f(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz5;->a(I)Lx5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, -0x1

    .line 8
    invoke-virtual {p0, p1}, Lx5;->a(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final g(I)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 2
    .line 3
    iget v0, p0, Lz5;->a:I

    .line 4
    .line 5
    add-int/lit8 v1, v0, -0x1

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    sub-int/2addr v0, v1

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lz5;->a(I)Lx5;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-boolean p1, p0, Lx5;->l:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-wide v2, p0, Lx5;->a:J

    .line 22
    .line 23
    const-wide/high16 v4, -0x8000000000000000L

    .line 24
    .line 25
    cmp-long p1, v2, v4

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    iget p0, p0, Lx5;->b:I

    .line 30
    .line 31
    const/4 p1, -0x1

    .line 32
    if-ne p0, p1, :cond_0

    .line 33
    .line 34
    return v1

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final h(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz5;->a(I)Lx5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-boolean p0, p0, Lx5;->k:Z

    .line 8
    .line 9
    return p0
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lzt4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    const/16 v2, 0xd9

    .line 13
    .line 14
    add-int/2addr v2, v0

    .line 15
    mul-int/lit8 v2, v2, 0x1f

    .line 16
    .line 17
    iget-object v0, p0, Lzt4;->b:Ljava/lang/Object;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    :goto_1
    add-int/2addr v2, v1

    .line 27
    mul-int/lit8 v2, v2, 0x1f

    .line 28
    .line 29
    iget v0, p0, Lzt4;->c:I

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    mul-int/lit8 v2, v2, 0x1f

    .line 33
    .line 34
    iget-wide v0, p0, Lzt4;->d:J

    .line 35
    .line 36
    const/16 v3, 0x20

    .line 37
    .line 38
    ushr-long v4, v0, v3

    .line 39
    .line 40
    xor-long/2addr v0, v4

    .line 41
    long-to-int v0, v0

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/lit8 v2, v2, 0x1f

    .line 44
    .line 45
    iget-wide v0, p0, Lzt4;->e:J

    .line 46
    .line 47
    ushr-long v3, v0, v3

    .line 48
    .line 49
    xor-long/2addr v0, v3

    .line 50
    long-to-int v0, v0

    .line 51
    add-int/2addr v2, v0

    .line 52
    mul-int/lit8 v2, v2, 0x1f

    .line 53
    .line 54
    iget-boolean v0, p0, Lzt4;->f:Z

    .line 55
    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/lit8 v2, v2, 0x1f

    .line 58
    .line 59
    iget-object p0, p0, Lzt4;->g:Lz5;

    .line 60
    .line 61
    invoke-virtual {p0}, Lz5;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    add-int/2addr p0, v2

    .line 66
    return p0
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;IJJLz5;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzt4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lzt4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput p3, p0, Lzt4;->c:I

    .line 6
    .line 7
    iput-wide p4, p0, Lzt4;->d:J

    .line 8
    .line 9
    iput-wide p6, p0, Lzt4;->e:J

    .line 10
    .line 11
    iput-object p8, p0, Lzt4;->g:Lz5;

    .line 12
    .line 13
    iput-boolean p9, p0, Lzt4;->f:Z

    .line 14
    .line 15
    return-void
.end method
