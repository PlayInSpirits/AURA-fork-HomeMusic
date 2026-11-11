.class public final Lnz0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:I


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0x4014666666666667L    # 5.1000000000000005

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    long-to-int v0, v0

    .line 11
    sput v0, Lnz0;->f:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    const v0, 0x7f0401cd

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {p1, v0, v1}, Lzz1;->E(Landroid/content/Context;IZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v2, 0x7f0401cc

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v2, v1}, Lg12;->s(Landroid/content/Context;II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0x7f0401cb

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v3, v1}, Lg12;->s(Landroid/content/Context;II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const v4, 0x7f04013b

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v4, v1}, Lg12;->s(Landroid/content/Context;II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 39
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-boolean v0, p0, Lnz0;->a:Z

    .line 44
    .line 45
    iput v2, p0, Lnz0;->b:I

    .line 46
    .line 47
    iput v3, p0, Lnz0;->c:I

    .line 48
    .line 49
    iput v1, p0, Lnz0;->d:I

    .line 50
    .line 51
    iput p1, p0, Lnz0;->e:F

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(IF)I
    .locals 4

    .line 1
    iget v0, p0, Lnz0;->e:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, v0, v1

    .line 5
    .line 6
    if-lez v2, :cond_1

    .line 7
    .line 8
    cmpg-float v2, p2, v1

    .line 9
    .line 10
    if-gtz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    div-float/2addr p2, v0

    .line 14
    float-to-double v2, p2

    .line 15
    invoke-static {v2, v3}, Ljava/lang/Math;->log1p(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    double-to-float p2, v2

    .line 20
    const/high16 v0, 0x40900000    # 4.5f

    .line 21
    .line 22
    mul-float/2addr p2, v0

    .line 23
    const/high16 v0, 0x40000000    # 2.0f

    .line 24
    .line 25
    add-float/2addr p2, v0

    .line 26
    const/high16 v0, 0x42c80000    # 100.0f

    .line 27
    .line 28
    div-float/2addr p2, v0

    .line 29
    const/high16 v0, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    move p2, v1

    .line 37
    :goto_1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/16 v2, 0xff

    .line 42
    .line 43
    invoke-static {p1, v2}, Lv50;->i(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget v2, p0, Lnz0;->b:I

    .line 48
    .line 49
    invoke-static {p1, p2, v2}, Lg12;->H(IFI)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    cmpl-float p2, p2, v1

    .line 54
    .line 55
    if-lez p2, :cond_2

    .line 56
    .line 57
    iget p0, p0, Lnz0;->c:I

    .line 58
    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    sget p2, Lnz0;->f:I

    .line 62
    .line 63
    invoke-static {p0, p2}, Lv50;->i(II)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0, p1}, Lv50;->g(II)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    :cond_2
    invoke-static {p1, v0}, Lv50;->i(II)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0
.end method

.method public final b(IF)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lnz0;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    invoke-static {p1, v0}, Lv50;->i(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Lnz0;->d:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lnz0;->a(IF)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    return p1
.end method
