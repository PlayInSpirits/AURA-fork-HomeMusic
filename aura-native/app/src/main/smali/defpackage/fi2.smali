.class public Ldefpackage/fi2;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/lc4;


# static fields
.field public static final J:Landroid/graphics/Paint;


# instance fields
.field public final A:Landroid/graphics/Paint;

.field public final B:Landroid/graphics/Paint;

.field public final C:Ldefpackage/yb4;

.field public final D:Ldefpackage/pz1;

.field public final E:Ldefpackage/fo1;

.field public F:Landroid/graphics/PorterDuffColorFilter;

.field public G:Landroid/graphics/PorterDuffColorFilter;

.field public final H:Landroid/graphics/RectF;

.field public I:Z

.field public n:Ldefpackage/ei2;

.field public final o:[Ldefpackage/jc4;

.field public final p:[Ldefpackage/jc4;

.field public final q:Ljava/util/BitSet;

.field public r:Z

.field public final s:Landroid/graphics/Matrix;

.field public final t:Landroid/graphics/Path;

.field public final u:Landroid/graphics/Path;

.field public final v:Landroid/graphics/RectF;

.field public final w:Landroid/graphics/RectF;

.field public final x:Landroid/graphics/Region;

.field public final y:Landroid/graphics/Region;

.field public z:Ldefpackage/bc4;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/fi2;->J:Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 14
    .line 15
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 158
    new-instance v0, Ldefpackage/bc4;

    invoke-direct {v0}, Ldefpackage/bc4;-><init>()V

    invoke-direct {p0, v0}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 156
    invoke-static {p1, p2, p3, p4}, Ldefpackage/bc4;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Ldefpackage/zc1;

    move-result-object p1

    invoke-virtual {p1}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    move-result-object p1

    invoke-direct {p0, p1}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    return-void
.end method

.method public constructor <init>(Ldefpackage/bc4;)V
    .locals 1

    .line 157
    new-instance v0, Ldefpackage/ei2;

    invoke-direct {v0, p1}, Ldefpackage/ei2;-><init>(Ldefpackage/bc4;)V

    invoke-direct {p0, v0}, Ldefpackage/fi2;-><init>(Ldefpackage/ei2;)V

    return-void
.end method

.method public constructor <init>(Ldefpackage/ei2;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [Ldefpackage/jc4;

    .line 6
    .line 7
    iput-object v1, p0, Ldefpackage/fi2;->o:[Ldefpackage/jc4;

    .line 8
    .line 9
    new-array v1, v0, [Ldefpackage/jc4;

    .line 10
    .line 11
    iput-object v1, p0, Ldefpackage/fi2;->p:[Ldefpackage/jc4;

    .line 12
    .line 13
    new-instance v1, Ljava/util/BitSet;

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Ldefpackage/fi2;->q:Ljava/util/BitSet;

    .line 21
    .line 22
    new-instance v1, Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Ldefpackage/fi2;->s:Landroid/graphics/Matrix;

    .line 28
    .line 29
    new-instance v1, Landroid/graphics/Path;

    .line 30
    .line 31
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Ldefpackage/fi2;->t:Landroid/graphics/Path;

    .line 35
    .line 36
    new-instance v1, Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Ldefpackage/fi2;->u:Landroid/graphics/Path;

    .line 42
    .line 43
    new-instance v1, Landroid/graphics/RectF;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Ldefpackage/fi2;->v:Landroid/graphics/RectF;

    .line 49
    .line 50
    new-instance v1, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Ldefpackage/fi2;->w:Landroid/graphics/RectF;

    .line 56
    .line 57
    new-instance v1, Landroid/graphics/Region;

    .line 58
    .line 59
    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Ldefpackage/fi2;->x:Landroid/graphics/Region;

    .line 63
    .line 64
    new-instance v1, Landroid/graphics/Region;

    .line 65
    .line 66
    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Ldefpackage/fi2;->y:Landroid/graphics/Region;

    .line 70
    .line 71
    new-instance v1, Landroid/graphics/Paint;

    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Ldefpackage/fi2;->A:Landroid/graphics/Paint;

    .line 78
    .line 79
    new-instance v3, Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-direct {v3, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iput-object v3, p0, Ldefpackage/fi2;->B:Landroid/graphics/Paint;

    .line 85
    .line 86
    new-instance v4, Ldefpackage/yb4;

    .line 87
    .line 88
    invoke-direct {v4}, Ldefpackage/yb4;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v4, p0, Ldefpackage/fi2;->C:Ldefpackage/yb4;

    .line 92
    .line 93
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    if-ne v4, v5, :cond_0

    .line 106
    .line 107
    sget-object v4, Ldefpackage/cc4;->a:Ldefpackage/fo1;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    new-instance v4, Ldefpackage/fo1;

    .line 111
    .line 112
    invoke-direct {v4}, Ldefpackage/fo1;-><init>()V

    .line 113
    .line 114
    .line 115
    :goto_0
    iput-object v4, p0, Ldefpackage/fi2;->E:Ldefpackage/fo1;

    .line 116
    .line 117
    new-instance v4, Landroid/graphics/RectF;

    .line 118
    .line 119
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v4, p0, Ldefpackage/fi2;->H:Landroid/graphics/RectF;

    .line 123
    .line 124
    iput-boolean v2, p0, Ldefpackage/fi2;->I:Z

    .line 125
    .line 126
    iput-object p1, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 127
    .line 128
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 129
    .line 130
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 131
    .line 132
    .line 133
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 134
    .line 135
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Ldefpackage/fi2;->t()Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->s([I)Z

    .line 146
    .line 147
    .line 148
    new-instance p1, Ldefpackage/pz1;

    .line 149
    .line 150
    invoke-direct {p1, v0, p0}, Ldefpackage/pz1;-><init>(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, Ldefpackage/fi2;->D:Ldefpackage/pz1;

    .line 154
    .line 155
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/fi2;->invalidateSelf()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v2, v0, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 4
    .line 5
    iget v3, v0, Ldefpackage/ei2;->i:F

    .line 6
    .line 7
    iget-object v5, p0, Ldefpackage/fi2;->D:Ldefpackage/pz1;

    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/fi2;->E:Ldefpackage/fo1;

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    move-object v6, p2

    .line 13
    invoke-virtual/range {v1 .. v6}, Ldefpackage/fo1;->d(Ldefpackage/bc4;FLandroid/graphics/RectF;Ldefpackage/pz1;Landroid/graphics/Path;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 17
    .line 18
    iget p1, p1, Ldefpackage/ei2;->h:F

    .line 19
    .line 20
    const/high16 p2, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpl-float p1, p1, p2

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Ldefpackage/fi2;->s:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 32
    .line 33
    iget p2, p2, Ldefpackage/ei2;->h:F

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/high16 v1, 0x40000000    # 2.0f

    .line 40
    .line 41
    div-float/2addr v0, v1

    .line 42
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    div-float/2addr v2, v1

    .line 47
    invoke-virtual {p1, p2, p2, v0, v2}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object p0, p0, Ldefpackage/fi2;->H:Landroid/graphics/RectF;

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    invoke-virtual {v6, p0, p1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final c(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/ei2;->m:F

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    add-float/2addr v0, v1

    .line 7
    iget v1, p0, Ldefpackage/ei2;->l:F

    .line 8
    .line 9
    add-float/2addr v0, v1

    .line 10
    iget-object p0, p0, Ldefpackage/ei2;->b:Ldefpackage/nz0;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, Ldefpackage/nz0;->b(IF)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    return p1
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->q:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "fi2"

    .line 10
    .line 11
    const-string v1, "Compatibility shadow requested but can\'t be drawn for all operations in this shape."

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 17
    .line 18
    iget v0, v0, Ldefpackage/ei2;->p:I

    .line 19
    .line 20
    iget-object v1, p0, Ldefpackage/fi2;->t:Landroid/graphics/Path;

    .line 21
    .line 22
    iget-object v2, p0, Ldefpackage/fi2;->C:Ldefpackage/yb4;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v2, Ldefpackage/yb4;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/graphics/Paint;

    .line 29
    .line 30
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    const/4 v3, 0x4

    .line 35
    if-ge v0, v3, :cond_2

    .line 36
    .line 37
    iget-object v3, p0, Ldefpackage/fi2;->o:[Ldefpackage/jc4;

    .line 38
    .line 39
    aget-object v3, v3, v0

    .line 40
    .line 41
    iget-object v4, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 42
    .line 43
    iget v4, v4, Ldefpackage/ei2;->o:I

    .line 44
    .line 45
    sget-object v5, Ldefpackage/jc4;->b:Landroid/graphics/Matrix;

    .line 46
    .line 47
    invoke-virtual {v3, v5, v2, v4, p1}, Ldefpackage/jc4;->a(Landroid/graphics/Matrix;Ldefpackage/yb4;ILandroid/graphics/Canvas;)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Ldefpackage/fi2;->p:[Ldefpackage/jc4;

    .line 51
    .line 52
    aget-object v3, v3, v0

    .line 53
    .line 54
    iget-object v4, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 55
    .line 56
    iget v4, v4, Ldefpackage/ei2;->o:I

    .line 57
    .line 58
    invoke-virtual {v3, v5, v2, v4, p1}, Ldefpackage/jc4;->a(Landroid/graphics/Matrix;Ldefpackage/yb4;ILandroid/graphics/Canvas;)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iget-boolean v0, p0, Ldefpackage/fi2;->I:Z

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 69
    .line 70
    iget v0, v0, Ldefpackage/ei2;->p:I

    .line 71
    .line 72
    int-to-double v2, v0

    .line 73
    const-wide/16 v4, 0x0

    .line 74
    .line 75
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide v6

    .line 79
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    mul-double/2addr v6, v2

    .line 84
    double-to-int v0, v6

    .line 85
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 86
    .line 87
    iget p0, p0, Ldefpackage/ei2;->p:I

    .line 88
    .line 89
    int-to-double v2, p0

    .line 90
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 91
    .line 92
    .line 93
    move-result-wide v4

    .line 94
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    mul-double/2addr v4, v2

    .line 99
    double-to-int p0, v4

    .line 100
    neg-int v2, v0

    .line 101
    int-to-float v2, v2

    .line 102
    neg-int v3, p0

    .line 103
    int-to-float v3, v3

    .line 104
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 105
    .line 106
    .line 107
    sget-object v2, Ldefpackage/fi2;->J:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    int-to-float v0, v0

    .line 113
    int-to-float p0, p0

    .line 114
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 115
    .line 116
    .line 117
    :cond_3
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/fi2;->F:Landroid/graphics/PorterDuffColorFilter;

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/fi2;->A:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/graphics/Paint;->getAlpha()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    iget-object v2, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 17
    .line 18
    iget v2, v2, Ldefpackage/ei2;->k:I

    .line 19
    .line 20
    ushr-int/lit8 v4, v2, 0x7

    .line 21
    .line 22
    add-int/2addr v2, v4

    .line 23
    mul-int/2addr v2, v6

    .line 24
    ushr-int/lit8 v2, v2, 0x8

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v0, Ldefpackage/fi2;->G:Landroid/graphics/PorterDuffColorFilter;

    .line 30
    .line 31
    iget-object v7, v0, Ldefpackage/fi2;->B:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 37
    .line 38
    iget v2, v2, Ldefpackage/ei2;->j:F

    .line 39
    .line 40
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Landroid/graphics/Paint;->getAlpha()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    iget-object v2, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 48
    .line 49
    iget v2, v2, Ldefpackage/ei2;->k:I

    .line 50
    .line 51
    ushr-int/lit8 v4, v2, 0x7

    .line 52
    .line 53
    add-int/2addr v2, v4

    .line 54
    mul-int/2addr v2, v8

    .line 55
    ushr-int/lit8 v2, v2, 0x8

    .line 56
    .line 57
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 58
    .line 59
    .line 60
    iget-boolean v2, v0, Ldefpackage/fi2;->r:Z

    .line 61
    .line 62
    move v4, v2

    .line 63
    move-object v2, v3

    .line 64
    iget-object v3, v0, Ldefpackage/fi2;->t:Landroid/graphics/Path;

    .line 65
    .line 66
    if-eqz v4, :cond_6

    .line 67
    .line 68
    invoke-virtual {v0}, Ldefpackage/fi2;->i()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x0

    .line 73
    const/high16 v9, 0x40000000    # 2.0f

    .line 74
    .line 75
    if-eqz v4, :cond_0

    .line 76
    .line 77
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    div-float/2addr v4, v9

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v4, v5

    .line 84
    :goto_0
    neg-float v4, v4

    .line 85
    iget-object v10, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 86
    .line 87
    iget-object v10, v10, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 88
    .line 89
    invoke-virtual {v10}, Ldefpackage/bc4;->g()Ldefpackage/zc1;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    iget-object v12, v10, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 94
    .line 95
    instance-of v13, v12, Ldefpackage/oy3;

    .line 96
    .line 97
    if-eqz v13, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    new-instance v13, Ldefpackage/g6;

    .line 101
    .line 102
    invoke-direct {v13, v4, v12}, Ldefpackage/g6;-><init>(FLdefpackage/ke0;)V

    .line 103
    .line 104
    .line 105
    move-object v12, v13

    .line 106
    :goto_1
    iput-object v12, v11, Ldefpackage/zc1;->e:Ljava/lang/Object;

    .line 107
    .line 108
    iget-object v12, v10, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 109
    .line 110
    instance-of v13, v12, Ldefpackage/oy3;

    .line 111
    .line 112
    if-eqz v13, :cond_2

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    new-instance v13, Ldefpackage/g6;

    .line 116
    .line 117
    invoke-direct {v13, v4, v12}, Ldefpackage/g6;-><init>(FLdefpackage/ke0;)V

    .line 118
    .line 119
    .line 120
    move-object v12, v13

    .line 121
    :goto_2
    iput-object v12, v11, Ldefpackage/zc1;->f:Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v12, v10, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 124
    .line 125
    instance-of v13, v12, Ldefpackage/oy3;

    .line 126
    .line 127
    if-eqz v13, :cond_3

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    new-instance v13, Ldefpackage/g6;

    .line 131
    .line 132
    invoke-direct {v13, v4, v12}, Ldefpackage/g6;-><init>(FLdefpackage/ke0;)V

    .line 133
    .line 134
    .line 135
    move-object v12, v13

    .line 136
    :goto_3
    iput-object v12, v11, Ldefpackage/zc1;->h:Ljava/lang/Object;

    .line 137
    .line 138
    iget-object v10, v10, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 139
    .line 140
    instance-of v12, v10, Ldefpackage/oy3;

    .line 141
    .line 142
    if-eqz v12, :cond_4

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_4
    new-instance v12, Ldefpackage/g6;

    .line 146
    .line 147
    invoke-direct {v12, v4, v10}, Ldefpackage/g6;-><init>(FLdefpackage/ke0;)V

    .line 148
    .line 149
    .line 150
    move-object v10, v12

    .line 151
    :goto_4
    iput-object v10, v11, Ldefpackage/zc1;->g:Ljava/lang/Object;

    .line 152
    .line 153
    invoke-virtual {v11}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    iput-object v13, v0, Ldefpackage/fi2;->z:Ldefpackage/bc4;

    .line 158
    .line 159
    iget-object v4, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 160
    .line 161
    iget v14, v4, Ldefpackage/ei2;->i:F

    .line 162
    .line 163
    invoke-virtual {v0}, Ldefpackage/fi2;->g()Landroid/graphics/RectF;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    iget-object v15, v0, Ldefpackage/fi2;->w:Landroid/graphics/RectF;

    .line 168
    .line 169
    invoke-virtual {v15, v4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ldefpackage/fi2;->i()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_5

    .line 177
    .line 178
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    div-float v5, v4, v9

    .line 183
    .line 184
    :cond_5
    invoke-virtual {v15, v5, v5}, Landroid/graphics/RectF;->inset(FF)V

    .line 185
    .line 186
    .line 187
    iget-object v4, v0, Ldefpackage/fi2;->u:Landroid/graphics/Path;

    .line 188
    .line 189
    const/16 v16, 0x0

    .line 190
    .line 191
    iget-object v12, v0, Ldefpackage/fi2;->E:Ldefpackage/fo1;

    .line 192
    .line 193
    move-object/from16 v17, v4

    .line 194
    .line 195
    invoke-virtual/range {v12 .. v17}, Ldefpackage/fo1;->d(Ldefpackage/bc4;FLandroid/graphics/RectF;Ldefpackage/pz1;Landroid/graphics/Path;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ldefpackage/fi2;->g()Landroid/graphics/RectF;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v0, v4, v3}, Ldefpackage/fi2;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 203
    .line 204
    .line 205
    const/4 v4, 0x0

    .line 206
    iput-boolean v4, v0, Ldefpackage/fi2;->r:Z

    .line 207
    .line 208
    :cond_6
    iget-object v4, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 209
    .line 210
    iget v5, v4, Ldefpackage/ei2;->n:I

    .line 211
    .line 212
    const/4 v9, 0x1

    .line 213
    if-eq v5, v9, :cond_a

    .line 214
    .line 215
    iget v4, v4, Ldefpackage/ei2;->o:I

    .line 216
    .line 217
    if-lez v4, :cond_a

    .line 218
    .line 219
    const/4 v4, 0x2

    .line 220
    if-eq v5, v4, :cond_7

    .line 221
    .line 222
    invoke-virtual {v0}, Ldefpackage/fi2;->k()Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    if-nez v5, :cond_a

    .line 227
    .line 228
    invoke-virtual {v3}, Landroid/graphics/Path;->isConvex()Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-nez v5, :cond_a

    .line 233
    .line 234
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 235
    .line 236
    const/16 v9, 0x1d

    .line 237
    .line 238
    if-ge v5, v9, :cond_a

    .line 239
    .line 240
    :cond_7
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 241
    .line 242
    .line 243
    iget-object v5, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 244
    .line 245
    iget v5, v5, Ldefpackage/ei2;->p:I

    .line 246
    .line 247
    int-to-double v9, v5

    .line 248
    const-wide/16 v11, 0x0

    .line 249
    .line 250
    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    .line 251
    .line 252
    .line 253
    move-result-wide v13

    .line 254
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 255
    .line 256
    .line 257
    move-result-wide v13

    .line 258
    mul-double/2addr v13, v9

    .line 259
    double-to-int v5, v13

    .line 260
    iget-object v9, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 261
    .line 262
    iget v9, v9, Ldefpackage/ei2;->p:I

    .line 263
    .line 264
    int-to-double v9, v9

    .line 265
    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    .line 266
    .line 267
    .line 268
    move-result-wide v11

    .line 269
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 270
    .line 271
    .line 272
    move-result-wide v11

    .line 273
    mul-double/2addr v11, v9

    .line 274
    double-to-int v9, v11

    .line 275
    int-to-float v5, v5

    .line 276
    int-to-float v9, v9

    .line 277
    invoke-virtual {v1, v5, v9}, Landroid/graphics/Canvas;->translate(FF)V

    .line 278
    .line 279
    .line 280
    iget-boolean v5, v0, Ldefpackage/fi2;->I:Z

    .line 281
    .line 282
    if-nez v5, :cond_8

    .line 283
    .line 284
    invoke-virtual/range {p0 .. p1}, Ldefpackage/fi2;->d(Landroid/graphics/Canvas;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_5

    .line 291
    .line 292
    :cond_8
    iget-object v5, v0, Ldefpackage/fi2;->H:Landroid/graphics/RectF;

    .line 293
    .line 294
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    .line 303
    .line 304
    .line 305
    move-result v10

    .line 306
    int-to-float v10, v10

    .line 307
    sub-float/2addr v9, v10

    .line 308
    float-to-int v9, v9

    .line 309
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    .line 310
    .line 311
    .line 312
    move-result v10

    .line 313
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 314
    .line 315
    .line 316
    move-result-object v11

    .line 317
    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    int-to-float v11, v11

    .line 322
    sub-float/2addr v10, v11

    .line 323
    float-to-int v10, v10

    .line 324
    if-ltz v9, :cond_9

    .line 325
    .line 326
    if-ltz v10, :cond_9

    .line 327
    .line 328
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    float-to-int v11, v11

    .line 333
    iget-object v12, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 334
    .line 335
    iget v12, v12, Ldefpackage/ei2;->o:I

    .line 336
    .line 337
    mul-int/2addr v12, v4

    .line 338
    add-int/2addr v12, v11

    .line 339
    add-int/2addr v12, v9

    .line 340
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    float-to-int v5, v5

    .line 345
    iget-object v11, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 346
    .line 347
    iget v11, v11, Ldefpackage/ei2;->o:I

    .line 348
    .line 349
    mul-int/2addr v11, v4

    .line 350
    add-int/2addr v11, v5

    .line 351
    add-int/2addr v11, v10

    .line 352
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 353
    .line 354
    invoke-static {v12, v11, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    new-instance v5, Landroid/graphics/Canvas;

    .line 359
    .line 360
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    iget v11, v11, Landroid/graphics/Rect;->left:I

    .line 368
    .line 369
    iget-object v12, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 370
    .line 371
    iget v12, v12, Ldefpackage/ei2;->o:I

    .line 372
    .line 373
    sub-int/2addr v11, v12

    .line 374
    sub-int/2addr v11, v9

    .line 375
    int-to-float v9, v11

    .line 376
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 377
    .line 378
    .line 379
    move-result-object v11

    .line 380
    iget v11, v11, Landroid/graphics/Rect;->top:I

    .line 381
    .line 382
    iget-object v12, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 383
    .line 384
    iget v12, v12, Ldefpackage/ei2;->o:I

    .line 385
    .line 386
    sub-int/2addr v11, v12

    .line 387
    sub-int/2addr v11, v10

    .line 388
    int-to-float v10, v11

    .line 389
    neg-float v11, v9

    .line 390
    neg-float v12, v10

    .line 391
    invoke-virtual {v5, v11, v12}, Landroid/graphics/Canvas;->translate(FF)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v5}, Ldefpackage/fi2;->d(Landroid/graphics/Canvas;)V

    .line 395
    .line 396
    .line 397
    const/4 v5, 0x0

    .line 398
    invoke-virtual {v1, v4, v9, v10, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 405
    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_9
    const-string v0, "Invalid shadow bounds. Check that the treatments result in a valid path."

    .line 409
    .line 410
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :cond_a
    :goto_5
    iget-object v4, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 415
    .line 416
    iget-object v5, v4, Ldefpackage/ei2;->q:Landroid/graphics/Paint$Style;

    .line 417
    .line 418
    sget-object v9, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 419
    .line 420
    if-eq v5, v9, :cond_b

    .line 421
    .line 422
    sget-object v9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 423
    .line 424
    if-ne v5, v9, :cond_c

    .line 425
    .line 426
    :cond_b
    iget-object v4, v4, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 427
    .line 428
    invoke-virtual {v0}, Ldefpackage/fi2;->g()Landroid/graphics/RectF;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    invoke-virtual/range {v0 .. v5}, Ldefpackage/fi2;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Ldefpackage/bc4;Landroid/graphics/RectF;)V

    .line 433
    .line 434
    .line 435
    :cond_c
    invoke-virtual/range {p0 .. p0}, Ldefpackage/fi2;->i()Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_d

    .line 440
    .line 441
    invoke-virtual/range {p0 .. p1}, Ldefpackage/fi2;->f(Landroid/graphics/Canvas;)V

    .line 442
    .line 443
    .line 444
    :cond_d
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 448
    .line 449
    .line 450
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Ldefpackage/bc4;Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p4, p5}, Ldefpackage/bc4;->f(Landroid/graphics/RectF;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p3, p4, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 8
    .line 9
    invoke-interface {p3, p5}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 14
    .line 15
    iget p0, p0, Ldefpackage/ei2;->i:F

    .line 16
    .line 17
    mul-float/2addr p3, p0

    .line 18
    invoke-virtual {p1, p5, p3, p3, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public f(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v4, p0, Ldefpackage/fi2;->z:Ldefpackage/bc4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/fi2;->g()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v5, p0, Ldefpackage/fi2;->w:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v5, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/fi2;->i()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Ldefpackage/fi2;->B:Landroid/graphics/Paint;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/high16 v1, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float/2addr v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-virtual {v5, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Ldefpackage/fi2;->u:Landroid/graphics/Path;

    .line 33
    .line 34
    move-object v0, p0

    .line 35
    move-object v1, p1

    .line 36
    invoke-virtual/range {v0 .. v5}, Ldefpackage/fi2;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Ldefpackage/bc4;Landroid/graphics/RectF;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final g()Landroid/graphics/RectF;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Ldefpackage/fi2;->v:Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public getAlpha()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/ei2;->k:I

    .line 4
    .line 5
    return p0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget v0, v0, Ldefpackage/ei2;->n:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Ldefpackage/fi2;->k()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/fi2;->h()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 20
    .line 21
    iget v1, v1, Ldefpackage/ei2;->i:F

    .line 22
    .line 23
    mul-float/2addr v0, v1

    .line 24
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1, p0, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Ldefpackage/fi2;->g()Landroid/graphics/RectF;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, Ldefpackage/fi2;->t:Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1}, Ldefpackage/fi2;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v1}, Ldefpackage/te5;->M(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ei2;->g:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final getTransparentRegion()Landroid/graphics/Region;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/fi2;->x:Landroid/graphics/Region;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/fi2;->g()Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, Ldefpackage/fi2;->t:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v2}, Ldefpackage/fi2;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/fi2;->y:Landroid/graphics/Region;

    .line 20
    .line 21
    invoke-virtual {p0, v2, v1}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 22
    .line 23
    .line 24
    sget-object v0, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 25
    .line 26
    invoke-virtual {v1, p0, v0}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public final h()F
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/fi2;->g()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ei2;->q:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Ldefpackage/fi2;->B:Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v0, 0x0

    .line 20
    cmpl-float p0, p0, v0

    .line 21
    .line 22
    if-lez p0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final invalidateSelf()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/fi2;->r:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public isStateful()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 8
    .line 9
    iget-object v0, v0, Ldefpackage/ei2;->e:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 25
    .line 26
    iget-object v0, v0, Ldefpackage/ei2;->d:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 37
    .line 38
    iget-object p0, p0, Ldefpackage/ei2;->c:Landroid/content/res/ColorStateList;

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 52
    return p0
.end method

.method public final j(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/nz0;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ldefpackage/nz0;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Ldefpackage/ei2;->b:Ldefpackage/nz0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/fi2;->u()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/fi2;->g()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Ldefpackage/bc4;->f(Landroid/graphics/RectF;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final l(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/ei2;->m:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Ldefpackage/ei2;->m:F

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/fi2;->u()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final m(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ei2;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Ldefpackage/ei2;->c:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->onStateChange([I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/ei2;-><init>(Ldefpackage/ei2;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 9
    .line 10
    return-object p0
.end method

.method public final n(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/ei2;->i:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Ldefpackage/ei2;->i:F

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Ldefpackage/fi2;->r:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/fi2;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    const v0, -0xbbbbbc

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/fi2;->C:Ldefpackage/yb4;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Ldefpackage/yb4;->t(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/fi2;->r:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onStateChange([I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->s([I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Ldefpackage/fi2;->t()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    :goto_1
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Ldefpackage/fi2;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return p1
.end method

.method public final p()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/ei2;->n:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    iput v2, v0, Ldefpackage/ei2;->n:I

    .line 9
    .line 10
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final q(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ei2;->d:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Ldefpackage/ei2;->d:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->onStateChange([I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final r(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iput p1, v0, Ldefpackage/ei2;->j:F

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/fi2;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s([I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ei2;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/fi2;->A:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 15
    .line 16
    iget-object v3, v3, Ldefpackage/ei2;->c:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    iget-object v2, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 31
    .line 32
    iget-object v2, v2, Ldefpackage/ei2;->d:Landroid/content/res/ColorStateList;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object v2, p0, Ldefpackage/fi2;->B:Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 43
    .line 44
    iget-object p0, p0, Ldefpackage/ei2;->d:Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    invoke-virtual {p0, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eq v3, p0, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :cond_1
    return v0
.end method

.method public setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/ei2;->k:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Ldefpackage/ei2;->k:I

    .line 8
    .line 9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setShapeAppearanceModel(Ldefpackage/bc4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iput-object p1, v0, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/fi2;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTint(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iput-object p1, v0, Ldefpackage/ei2;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/fi2;->t()Z

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ei2;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Ldefpackage/ei2;->f:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/fi2;->t()Z

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final t()Z
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->F:Landroid/graphics/PorterDuffColorFilter;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/fi2;->G:Landroid/graphics/PorterDuffColorFilter;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 6
    .line 7
    iget-object v3, v2, Ldefpackage/ei2;->e:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v2, v2, Ldefpackage/ei2;->f:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual {v3, v7, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {p0, v3}, Ldefpackage/fi2;->c(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    new-instance v7, Landroid/graphics/PorterDuffColorFilter;

    .line 32
    .line 33
    invoke-direct {v7, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    iget-object v2, p0, Ldefpackage/fi2;->A:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p0, v2}, Ldefpackage/fi2;->c(I)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eq v3, v2, :cond_2

    .line 48
    .line 49
    new-instance v7, Landroid/graphics/PorterDuffColorFilter;

    .line 50
    .line 51
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 52
    .line 53
    invoke-direct {v7, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v7, v4

    .line 58
    :goto_1
    iput-object v7, p0, Ldefpackage/fi2;->F:Landroid/graphics/PorterDuffColorFilter;

    .line 59
    .line 60
    iget-object v2, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput-object v4, p0, Ldefpackage/fi2;->G:Landroid/graphics/PorterDuffColorFilter;

    .line 66
    .line 67
    iget-object v2, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Ldefpackage/fi2;->F:Landroid/graphics/PorterDuffColorFilter;

    .line 73
    .line 74
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object p0, p0, Ldefpackage/fi2;->G:Landroid/graphics/PorterDuffColorFilter;

    .line 81
    .line 82
    invoke-static {v1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    return v5

    .line 90
    :cond_4
    :goto_2
    return v6
.end method

.method public final u()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/ei2;->m:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    add-float/2addr v1, v2

    .line 7
    const/high16 v2, 0x3f400000    # 0.75f

    .line 8
    .line 9
    mul-float/2addr v2, v1

    .line 10
    float-to-double v2, v2

    .line 11
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    double-to-int v2, v2

    .line 16
    iput v2, v0, Ldefpackage/ei2;->o:I

    .line 17
    .line 18
    iget-object v0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 19
    .line 20
    const/high16 v2, 0x3e800000    # 0.25f

    .line 21
    .line 22
    mul-float/2addr v1, v2

    .line 23
    float-to-double v1, v1

    .line 24
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    double-to-int v1, v1

    .line 29
    iput v1, v0, Ldefpackage/ei2;->p:I

    .line 30
    .line 31
    invoke-virtual {p0}, Ldefpackage/fi2;->t()Z

    .line 32
    .line 33
    .line 34
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 35
    .line 36
    .line 37
    return-void
.end method
