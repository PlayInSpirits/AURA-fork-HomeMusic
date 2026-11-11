.class public final Lyb4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lzi4;


# static fields
.field public static final i:[I

.field public static final j:[F

.field public static final k:[I

.field public static final l:[F


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    sput-object v1, Lyb4;->i:[I

    .line 5
    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    fill-array-data v0, :array_0

    .line 9
    .line 10
    .line 11
    sput-object v0, Lyb4;->j:[F

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    new-array v1, v0, [I

    .line 15
    .line 16
    sput-object v1, Lyb4;->k:[I

    .line 17
    .line 18
    new-array v0, v0, [F

    .line 19
    .line 20
    fill-array-data v0, :array_1

    .line 21
    .line 22
    .line 23
    sput-object v0, Lyb4;->l:[F

    .line 24
    .line 25
    return-void

    .line 26
    nop

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyb4;->h:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyb4;->g:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lyb4;->d:Ljava/lang/Object;

    .line 24
    .line 25
    const/high16 v1, -0x1000000

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lyb4;->t(I)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Landroid/graphics/Paint;

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lyb4;->e:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Landroid/graphics/Paint;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lyb4;->f:Ljava/lang/Object;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Laj4;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyb4;->h:Ljava/lang/Object;

    .line 56
    iget v0, p1, Laj4;->h:I

    .line 57
    new-array v1, v0, [S

    iput-object v1, p0, Lyb4;->d:Ljava/lang/Object;

    .line 58
    iget p1, p1, Laj4;->b:I

    mul-int/2addr v0, p1

    .line 59
    new-array p1, v0, [S

    iput-object p1, p0, Lyb4;->e:Ljava/lang/Object;

    .line 60
    new-array p1, v0, [S

    iput-object p1, p0, Lyb4;->f:Ljava/lang/Object;

    .line 61
    new-array p1, v0, [S

    iput-object p1, p0, Lyb4;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(ILjava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyb4;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [S

    .line 8
    .line 9
    iget-object p0, p0, Lyb4;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Laj4;

    .line 12
    .line 13
    iget v2, p0, Laj4;->j:I

    .line 14
    .line 15
    iget p0, p0, Laj4;->b:I

    .line 16
    .line 17
    mul-int/2addr v2, p0

    .line 18
    div-int/lit8 p0, p1, 0x2

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2, p0}, Ljava/nio/ShortBuffer;->get([SII)Ljava/nio/ShortBuffer;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    add-int/2addr p0, p1

    .line 28
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public b(ILjava/nio/ByteBuffer;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyb4;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [S

    .line 8
    .line 9
    iget-object p0, p0, Lyb4;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Laj4;

    .line 12
    .line 13
    iget p0, p0, Laj4;->b:I

    .line 14
    .line 15
    mul-int v2, p1, p0

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v0, v1, v3, v2}, Ljava/nio/ShortBuffer;->put([SII)Ljava/nio/ShortBuffer;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    mul-int/lit8 p1, p1, 0x2

    .line 26
    .line 27
    mul-int/2addr p1, p0

    .line 28
    add-int/2addr p1, v0

    .line 29
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public c(IJJ)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lyb4;->h:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Laj4;

    .line 5
    .line 6
    iget v2, v1, Laj4;->b:I

    .line 7
    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, Lyb4;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, [S

    .line 13
    .line 14
    iget v4, v1, Laj4;->k:I

    .line 15
    .line 16
    mul-int/2addr v4, v2

    .line 17
    add-int/2addr v4, v0

    .line 18
    iget-object v5, p0, Lyb4;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, [S

    .line 21
    .line 22
    mul-int v6, p1, v2

    .line 23
    .line 24
    add-int/2addr v6, v0

    .line 25
    aget-short v7, v5, v6

    .line 26
    .line 27
    add-int/2addr v6, v2

    .line 28
    aget-short v2, v5, v6

    .line 29
    .line 30
    iget v5, v1, Laj4;->n:I

    .line 31
    .line 32
    int-to-long v5, v5

    .line 33
    mul-long/2addr v5, p2

    .line 34
    iget v1, v1, Laj4;->m:I

    .line 35
    .line 36
    int-to-long v8, v1

    .line 37
    mul-long v8, v8, p4

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    int-to-long v10, v1

    .line 42
    mul-long v10, v10, p4

    .line 43
    .line 44
    sub-long v5, v10, v5

    .line 45
    .line 46
    sub-long/2addr v10, v8

    .line 47
    int-to-long v7, v7

    .line 48
    mul-long/2addr v7, v5

    .line 49
    sub-long v5, v10, v5

    .line 50
    .line 51
    int-to-long v1, v2

    .line 52
    mul-long/2addr v5, v1

    .line 53
    add-long/2addr v5, v7

    .line 54
    div-long/2addr v5, v10

    .line 55
    long-to-int v1, v5

    .line 56
    int-to-short v1, v1

    .line 57
    aput-short v1, v3, v4

    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    return-void
.end method

.method public d(II)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lyb4;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Laj4;

    .line 6
    .line 7
    iget v2, v2, Laj4;->b:I

    .line 8
    .line 9
    mul-int/2addr v2, p2

    .line 10
    if-ge v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lyb4;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, [S

    .line 15
    .line 16
    add-int v3, p1, v1

    .line 17
    .line 18
    aput-short v0, v2, v3

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public e(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyb4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [S

    .line 4
    .line 5
    iget-object v1, p0, Lyb4;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Laj4;

    .line 8
    .line 9
    iget v2, v1, Laj4;->h:I

    .line 10
    .line 11
    div-int/2addr v2, p2

    .line 12
    iget v1, v1, Laj4;->b:I

    .line 13
    .line 14
    mul-int/2addr p2, v1

    .line 15
    mul-int/2addr p1, v1

    .line 16
    const/4 v1, 0x0

    .line 17
    move v3, v1

    .line 18
    :goto_0
    if-ge v3, v2, :cond_1

    .line 19
    .line 20
    move v4, v1

    .line 21
    move v5, v4

    .line 22
    :goto_1
    if-ge v4, p2, :cond_0

    .line 23
    .line 24
    mul-int v6, v3, p2

    .line 25
    .line 26
    add-int/2addr v6, p1

    .line 27
    add-int/2addr v6, v4

    .line 28
    aget-short v6, v0, v6

    .line 29
    .line 30
    add-int/2addr v5, v6

    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    div-int/2addr v5, p2

    .line 35
    iget-object v4, p0, Lyb4;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, [S

    .line 38
    .line 39
    int-to-short v5, v5

    .line 40
    aput-short v5, v4, v3

    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public f(III)I
    .locals 1

    .line 1
    iget-object v0, p0, Lyb4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [S

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1, p2, p3}, Lyb4;->s([SIII)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public flush()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyb4;->c:I

    .line 3
    .line 4
    iput v0, p0, Lyb4;->a:I

    .line 5
    .line 6
    iput v0, p0, Lyb4;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget v0, p0, Lyb4;->a:I

    .line 2
    .line 3
    iput v0, p0, Lyb4;->c:I

    .line 4
    .line 5
    return-void
.end method

.method public h()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyb4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [S

    .line 4
    .line 5
    return-object p0
.end method

.method public i()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyb4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [S

    .line 4
    .line 5
    return-object p0
.end method

.method public j(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyb4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [S

    .line 4
    .line 5
    iget-object v1, p0, Lyb4;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Laj4;

    .line 8
    .line 9
    iget v1, v1, Laj4;->k:I

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, p1}, Lyb4;->r([SII)[S

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lyb4;->f:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public k()Z
    .locals 3

    .line 1
    iget v0, p0, Lyb4;->a:I

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, p0, Lyb4;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Laj4;

    .line 8
    .line 9
    iget v1, v1, Laj4;->p:I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v1, p0, Lyb4;->b:I

    .line 15
    .line 16
    mul-int/lit8 v2, v0, 0x3

    .line 17
    .line 18
    if-le v1, v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    mul-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    iget p0, p0, Lyb4;->c:I

    .line 24
    .line 25
    mul-int/lit8 p0, p0, 0x3

    .line 26
    .line 27
    if-gt v0, p0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public l()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyb4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [S

    .line 4
    .line 5
    return-object p0
.end method

.method public m(IIIII)V
    .locals 9

    .line 1
    iget-object v0, p0, Lyb4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [S

    .line 4
    .line 5
    iget-object p0, p0, Lyb4;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, [S

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, p2, :cond_1

    .line 12
    .line 13
    mul-int v3, p3, p2

    .line 14
    .line 15
    add-int/2addr v3, v2

    .line 16
    mul-int v4, p5, p2

    .line 17
    .line 18
    add-int/2addr v4, v2

    .line 19
    mul-int v5, p4, p2

    .line 20
    .line 21
    add-int/2addr v5, v2

    .line 22
    move v6, v1

    .line 23
    :goto_1
    if-ge v6, p1, :cond_0

    .line 24
    .line 25
    aget-short v7, p0, v5

    .line 26
    .line 27
    sub-int v8, p1, v6

    .line 28
    .line 29
    mul-int/2addr v8, v7

    .line 30
    aget-short v7, p0, v4

    .line 31
    .line 32
    mul-int/2addr v7, v6

    .line 33
    add-int/2addr v7, v8

    .line 34
    div-int/2addr v7, p1

    .line 35
    int-to-short v7, v7

    .line 36
    aput-short v7, v0, v3

    .line 37
    .line 38
    add-int/2addr v3, p2

    .line 39
    add-int/2addr v5, p2

    .line 40
    add-int/2addr v4, p2

    .line 41
    add-int/lit8 v6, v6, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method

.method public n(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyb4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [S

    .line 4
    .line 5
    iget-object v1, p0, Lyb4;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Laj4;

    .line 8
    .line 9
    iget v1, v1, Laj4;->l:I

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, p1}, Lyb4;->r([SII)[S

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lyb4;->g:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public o()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public p(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyb4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [S

    .line 4
    .line 5
    iget-object v1, p0, Lyb4;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Laj4;

    .line 8
    .line 9
    iget v1, v1, Laj4;->j:I

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, p1}, Lyb4;->r([SII)[S

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lyb4;->e:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public q(II)I
    .locals 2

    .line 1
    iget-object v0, p0, Lyb4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [S

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, v1, p1, p2}, Lyb4;->s([SIII)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public r([SII)[S
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    iget-object p0, p0, Lyb4;->h:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast p0, Laj4;

    .line 5
    .line 6
    iget p0, p0, Laj4;->b:I

    .line 7
    .line 8
    div-int/2addr v0, p0

    .line 9
    add-int/2addr p2, p3

    .line 10
    if-gt p2, v0, :cond_0

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    mul-int/lit8 v0, v0, 0x3

    .line 14
    .line 15
    div-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    add-int/2addr v0, p3

    .line 18
    mul-int/2addr v0, p0

    .line 19
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([SI)[S

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public s([SIII)I
    .locals 9

    .line 1
    iget-object v0, p0, Lyb4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Laj4;

    .line 4
    .line 5
    iget v0, v0, Laj4;->b:I

    .line 6
    .line 7
    mul-int/2addr p2, v0

    .line 8
    const/4 v0, 0x0

    .line 9
    const/16 v1, 0xff

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    move v3, v0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-gt p3, p4, :cond_3

    .line 15
    .line 16
    move v5, v0

    .line 17
    move v6, v5

    .line 18
    :goto_1
    if-ge v5, p3, :cond_0

    .line 19
    .line 20
    add-int v7, p2, v5

    .line 21
    .line 22
    aget-short v7, p1, v7

    .line 23
    .line 24
    add-int v8, p2, p3

    .line 25
    .line 26
    add-int/2addr v8, v5

    .line 27
    aget-short v8, p1, v8

    .line 28
    .line 29
    sub-int/2addr v7, v8

    .line 30
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    add-int/2addr v6, v7

    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    mul-int v5, v6, v3

    .line 39
    .line 40
    mul-int v7, v2, p3

    .line 41
    .line 42
    if-ge v5, v7, :cond_1

    .line 43
    .line 44
    move v3, p3

    .line 45
    move v2, v6

    .line 46
    :cond_1
    mul-int v5, v6, v1

    .line 47
    .line 48
    mul-int v7, v4, p3

    .line 49
    .line 50
    if-le v5, v7, :cond_2

    .line 51
    .line 52
    move v1, p3

    .line 53
    move v4, v6

    .line 54
    :cond_2
    add-int/lit8 p3, p3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    div-int/2addr v2, v3

    .line 58
    iput v2, p0, Lyb4;->a:I

    .line 59
    .line 60
    div-int/2addr v4, v1

    .line 61
    iput v4, p0, Lyb4;->b:I

    .line 62
    .line 63
    return v3
.end method

.method public t(I)V
    .locals 1

    .line 1
    const/16 v0, 0x44

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv50;->i(II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lyb4;->a:I

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    invoke-static {p1, v0}, Lv50;->i(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lyb4;->b:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {p1, v0}, Lv50;->i(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lyb4;->c:I

    .line 23
    .line 24
    iget-object p1, p0, Lyb4;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroid/graphics/Paint;

    .line 27
    .line 28
    iget p0, p0, Lyb4;->a:I

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
