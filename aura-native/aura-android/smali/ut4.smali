.class public final Lut4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static k:Lut4;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method public static c()Lut4;
    .locals 1

    .line 1
    sget-object v0, Lut4;->k:Lut4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lut4;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lut4;->k:Lut4;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lut4;->k:Lut4;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    invoke-static {}, Lud3;->I()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    int-to-float v4, v1

    .line 30
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    div-float/2addr p1, v4

    .line 35
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/16 v4, 0xa

    .line 40
    .line 41
    sub-int/2addr p1, v4

    .line 42
    int-to-float p1, p1

    .line 43
    div-float/2addr v0, p1

    .line 44
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, p0, Lut4;->d:I

    .line 53
    .line 54
    if-eq v1, v2, :cond_3

    .line 55
    .line 56
    const/4 p1, 0x4

    .line 57
    if-eq v1, p1, :cond_2

    .line 58
    .line 59
    const/4 p1, 0x5

    .line 60
    const/4 v0, 0x6

    .line 61
    if-eq v1, p1, :cond_1

    .line 62
    .line 63
    if-eq v1, v0, :cond_0

    .line 64
    .line 65
    const/16 p1, 0x14

    .line 66
    .line 67
    iput p1, p0, Lut4;->e:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    iput v3, p0, Lut4;->e:I

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    iput v0, p0, Lut4;->e:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iput v4, p0, Lut4;->e:I

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    const/16 p1, 0xf

    .line 80
    .line 81
    iput p1, p0, Lut4;->e:I

    .line 82
    .line 83
    :goto_0
    const/4 p1, 0x1

    .line 84
    iput-boolean p1, p0, Lut4;->i:Z

    .line 85
    .line 86
    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    invoke-static {}, Lud3;->I()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x6

    .line 20
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    int-to-float v4, v1

    .line 30
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    div-float/2addr p1, v4

    .line 35
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/16 v4, 0xa

    .line 40
    .line 41
    sub-int/2addr p1, v4

    .line 42
    iput p1, p0, Lut4;->a:I

    .line 43
    .line 44
    int-to-float p1, p1

    .line 45
    div-float/2addr v0, p1

    .line 46
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput p1, p0, Lut4;->b:I

    .line 55
    .line 56
    const/4 p1, 0x3

    .line 57
    if-eq v1, p1, :cond_3

    .line 58
    .line 59
    const/4 p1, 0x4

    .line 60
    if-eq v1, p1, :cond_2

    .line 61
    .line 62
    const/4 p1, 0x5

    .line 63
    if-eq v1, p1, :cond_1

    .line 64
    .line 65
    if-eq v1, v2, :cond_0

    .line 66
    .line 67
    const/16 p1, 0x14

    .line 68
    .line 69
    iput p1, p0, Lut4;->c:I

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iput v3, p0, Lut4;->c:I

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    iput v2, p0, Lut4;->c:I

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iput v4, p0, Lut4;->c:I

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    const/16 p1, 0xf

    .line 82
    .line 83
    iput p1, p0, Lut4;->c:I

    .line 84
    .line 85
    :goto_0
    const/4 p1, 0x1

    .line 86
    iput-boolean p1, p0, Lut4;->h:Z

    .line 87
    .line 88
    return-void
.end method

.method public final d(Landroid/content/Context;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lut4;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lut4;->b(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget p0, p0, Lut4;->a:I

    .line 9
    .line 10
    return p0
.end method
