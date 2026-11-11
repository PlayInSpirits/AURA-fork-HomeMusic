.class public final Lxv4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lpv4;

.field public final b:I

.field public final c:[J

.field public final d:[I

.field public final e:I

.field public final f:[J

.field public final g:[I

.field public final h:[I

.field public final i:J

.field public final j:Z


# direct methods
.method public constructor <init>(Lpv4;[J[II[J[I[IZJI)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p3

    .line 5
    array-length v1, p5

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    move v0, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 14
    .line 15
    .line 16
    array-length v0, p2

    .line 17
    array-length v1, p5

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    move v0, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, v2

    .line 23
    :goto_1
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 24
    .line 25
    .line 26
    array-length v0, p6

    .line 27
    array-length v1, p5

    .line 28
    if-ne v0, v1, :cond_2

    .line 29
    .line 30
    move v2, v3

    .line 31
    :cond_2
    invoke-static {v2}, Lrr2;->l(Z)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lxv4;->a:Lpv4;

    .line 35
    .line 36
    iput-object p2, p0, Lxv4;->c:[J

    .line 37
    .line 38
    iput-object p3, p0, Lxv4;->d:[I

    .line 39
    .line 40
    iput p4, p0, Lxv4;->e:I

    .line 41
    .line 42
    iput-object p5, p0, Lxv4;->f:[J

    .line 43
    .line 44
    iput-object p6, p0, Lxv4;->g:[I

    .line 45
    .line 46
    iput-object p7, p0, Lxv4;->h:[I

    .line 47
    .line 48
    iput-boolean p8, p0, Lxv4;->j:Z

    .line 49
    .line 50
    iput-wide p9, p0, Lxv4;->i:J

    .line 51
    .line 52
    iput p11, p0, Lxv4;->b:I

    .line 53
    .line 54
    array-length p0, p6

    .line 55
    if-lez p0, :cond_3

    .line 56
    .line 57
    array-length p0, p6

    .line 58
    sub-int/2addr p0, v3

    .line 59
    aget p1, p6, p0

    .line 60
    .line 61
    const/high16 p2, 0x20000000

    .line 62
    .line 63
    or-int/2addr p1, p2

    .line 64
    aput p1, p6, p0

    .line 65
    .line 66
    :cond_3
    return-void
.end method


# virtual methods
.method public final a(J)I
    .locals 8

    .line 1
    iget-boolean v0, p0, Lxv4;->j:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lxv4;->f:[J

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2, p1, p2, v1}, Lf35;->f([JJZ)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object p0, p0, Lxv4;->h:[I

    .line 14
    .line 15
    array-length v0, p0

    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    const/4 v3, -0x1

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-gt v1, v0, :cond_2

    .line 21
    .line 22
    sub-int v5, v0, v1

    .line 23
    .line 24
    div-int/lit8 v5, v5, 0x2

    .line 25
    .line 26
    add-int/2addr v5, v1

    .line 27
    aget v6, p0, v5

    .line 28
    .line 29
    aget-wide v6, v2, v6

    .line 30
    .line 31
    cmp-long v6, v6, p1

    .line 32
    .line 33
    if-gtz v6, :cond_1

    .line 34
    .line 35
    add-int/lit8 v1, v5, 0x1

    .line 36
    .line 37
    move v4, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    add-int/lit8 v5, v5, -0x1

    .line 40
    .line 41
    move v0, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-ne v4, v3, :cond_3

    .line 44
    .line 45
    return v3

    .line 46
    :cond_3
    aget v0, p0, v4

    .line 47
    .line 48
    aget-wide v0, v2, v0

    .line 49
    .line 50
    cmp-long p1, v0, p1

    .line 51
    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    :goto_1
    if-lez v4, :cond_4

    .line 55
    .line 56
    add-int/lit8 p1, v4, -0x1

    .line 57
    .line 58
    aget p1, p0, p1

    .line 59
    .line 60
    aget-wide p1, v2, p1

    .line 61
    .line 62
    cmp-long p1, p1, v0

    .line 63
    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    add-int/lit8 v4, v4, -0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    aget p0, p0, v4

    .line 70
    .line 71
    return p0
.end method

.method public final b(J)I
    .locals 9

    .line 1
    iget-boolean v0, p0, Lxv4;->j:Z

    .line 2
    .line 3
    iget-object v1, p0, Lxv4;->f:[J

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v1, p1, p2, v2}, Lf35;->b([JJZ)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object p0, p0, Lxv4;->h:[I

    .line 14
    .line 15
    array-length v0, p0

    .line 16
    sub-int/2addr v0, v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, -0x1

    .line 19
    move v5, v4

    .line 20
    :goto_0
    if-gt v3, v0, :cond_2

    .line 21
    .line 22
    sub-int v6, v0, v3

    .line 23
    .line 24
    div-int/lit8 v6, v6, 0x2

    .line 25
    .line 26
    add-int/2addr v6, v3

    .line 27
    aget v7, p0, v6

    .line 28
    .line 29
    aget-wide v7, v1, v7

    .line 30
    .line 31
    cmp-long v7, v7, p1

    .line 32
    .line 33
    if-ltz v7, :cond_1

    .line 34
    .line 35
    add-int/lit8 v0, v6, -0x1

    .line 36
    .line 37
    move v5, v6

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 40
    .line 41
    move v3, v6

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-ne v5, v4, :cond_3

    .line 44
    .line 45
    return v4

    .line 46
    :cond_3
    aget v0, p0, v5

    .line 47
    .line 48
    aget-wide v3, v1, v0

    .line 49
    .line 50
    cmp-long p1, v3, p1

    .line 51
    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    :goto_1
    array-length p1, p0

    .line 55
    sub-int/2addr p1, v2

    .line 56
    if-ge v5, p1, :cond_4

    .line 57
    .line 58
    add-int/lit8 p1, v5, 0x1

    .line 59
    .line 60
    aget p2, p0, p1

    .line 61
    .line 62
    aget-wide v6, v1, p2

    .line 63
    .line 64
    cmp-long p2, v6, v3

    .line 65
    .line 66
    if-nez p2, :cond_4

    .line 67
    .line 68
    move v5, p1

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    aget p0, p0, v5

    .line 71
    .line 72
    return p0
.end method
