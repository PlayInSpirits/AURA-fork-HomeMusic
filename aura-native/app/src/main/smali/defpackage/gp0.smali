.class public final Ldefpackage/gp0;
.super Ldefpackage/cw0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final D:Ldefpackage/fp0;


# instance fields
.field public final A:Ldefpackage/zj4;

.field public B:F

.field public C:Z

.field public final y:Ldefpackage/mw0;

.field public final z:Ldefpackage/ak4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/fp0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/gp0;->D:Ldefpackage/fp0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/jq;Ldefpackage/mw0;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Ldefpackage/cw0;-><init>(Landroid/content/Context;Ldefpackage/jq;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Ldefpackage/gp0;->C:Z

    .line 6
    .line 7
    iput-object p3, p0, Ldefpackage/gp0;->y:Ldefpackage/mw0;

    .line 8
    .line 9
    iput-object p0, p3, Ldefpackage/mw0;->b:Ldefpackage/cw0;

    .line 10
    .line 11
    new-instance p2, Ldefpackage/ak4;

    .line 12
    .line 13
    invoke-direct {p2}, Ldefpackage/ak4;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Ldefpackage/gp0;->z:Ldefpackage/ak4;

    .line 17
    .line 18
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 19
    .line 20
    iput-wide v0, p2, Ldefpackage/ak4;->b:D

    .line 21
    .line 22
    iput-boolean p1, p2, Ldefpackage/ak4;->c:Z

    .line 23
    .line 24
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iput-wide v0, p2, Ldefpackage/ak4;->a:D

    .line 31
    .line 32
    iput-boolean p1, p2, Ldefpackage/ak4;->c:Z

    .line 33
    .line 34
    new-instance p1, Ldefpackage/zj4;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Ldefpackage/zj4;-><init>(Ldefpackage/gp0;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Ldefpackage/gp0;->A:Ldefpackage/zj4;

    .line 40
    .line 41
    iput-object p2, p1, Ldefpackage/zj4;->k:Ldefpackage/ak4;

    .line 42
    .line 43
    iget p1, p0, Ldefpackage/cw0;->u:F

    .line 44
    .line 45
    const/high16 p2, 0x3f800000    # 1.0f

    .line 46
    .line 47
    cmpl-float p1, p1, p2

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    iput p2, p0, Ldefpackage/cw0;->u:F

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0}, Ldefpackage/cw0;->b()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v2, p0, Ldefpackage/gp0;->y:Ldefpackage/mw0;

    .line 41
    .line 42
    iget-object v3, v2, Ldefpackage/mw0;->a:Ldefpackage/jq;

    .line 43
    .line 44
    invoke-virtual {v3}, Ldefpackage/jq;->a()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p1, v0, v1}, Ldefpackage/mw0;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;F)V

    .line 48
    .line 49
    .line 50
    iget-object v6, p0, Ldefpackage/cw0;->v:Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-virtual {v2, p1, v6}, Ldefpackage/mw0;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Ldefpackage/cw0;->o:Ldefpackage/jq;

    .line 56
    .line 57
    iget-object v0, v0, Ldefpackage/jq;->c:[I

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    aget v0, v0, v1

    .line 61
    .line 62
    iget v1, p0, Ldefpackage/cw0;->w:I

    .line 63
    .line 64
    invoke-static {v0, v1}, Ldefpackage/g12;->l(II)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const/4 v7, 0x0

    .line 69
    iget v8, p0, Ldefpackage/gp0;->B:F

    .line 70
    .line 71
    iget-object v4, p0, Ldefpackage/gp0;->y:Ldefpackage/mw0;

    .line 72
    .line 73
    move-object v5, p1

    .line 74
    invoke-virtual/range {v4 .. v9}, Ldefpackage/mw0;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Landroid/graphics/Canvas;->restore()V

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_0
    return-void
.end method

.method public final f(ZZZ)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Ldefpackage/cw0;->f(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p2, p0, Ldefpackage/cw0;->p:Ldefpackage/ee;

    .line 6
    .line 7
    iget-object p3, p0, Ldefpackage/cw0;->n:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p2, "animator_duration_scale"

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-static {p3, p2, v0}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 p3, 0x0

    .line 25
    cmpl-float v0, p2, p3

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    iput-boolean p2, p0, Ldefpackage/gp0;->C:Z

    .line 31
    .line 32
    return p1

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Ldefpackage/gp0;->C:Z

    .line 35
    .line 36
    const/high16 v1, 0x42480000    # 50.0f

    .line 37
    .line 38
    div-float/2addr v1, p2

    .line 39
    iget-object p0, p0, Ldefpackage/gp0;->z:Ldefpackage/ak4;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    cmpg-float p2, v1, p3

    .line 45
    .line 46
    if-lez p2, :cond_1

    .line 47
    .line 48
    float-to-double p2, v1

    .line 49
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    iput-wide p2, p0, Ldefpackage/ak4;->a:D

    .line 54
    .line 55
    iput-boolean v0, p0, Ldefpackage/ak4;->c:Z

    .line 56
    .line 57
    return p1

    .line 58
    :cond_1
    const-string p0, "Spring stiffness constant must be positive."

    .line 59
    .line 60
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return v0
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gp0;->y:Ldefpackage/mw0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/mw0;->d()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gp0;->y:Ldefpackage/mw0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/mw0;->e()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final jumpToCurrentState()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/gp0;->A:Ldefpackage/zj4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/zj4;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    int-to-float v0, v0

    .line 11
    const v1, 0x461c4000    # 10000.0f

    .line 12
    .line 13
    .line 14
    div-float/2addr v0, v1

    .line 15
    iput v0, p0, Ldefpackage/gp0;->B:F

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onLevelChange(I)Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Ldefpackage/gp0;->C:Z

    .line 2
    .line 3
    const v1, 0x461c4000    # 10000.0f

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    iget-object v3, p0, Ldefpackage/gp0;->A:Ldefpackage/zj4;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v3}, Ldefpackage/zj4;->b()V

    .line 12
    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    div-float/2addr p1, v1

    .line 16
    iput p1, p0, Ldefpackage/gp0;->B:F

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 19
    .line 20
    .line 21
    return v2

    .line 22
    :cond_0
    iget p0, p0, Ldefpackage/gp0;->B:F

    .line 23
    .line 24
    mul-float/2addr p0, v1

    .line 25
    iput p0, v3, Ldefpackage/zj4;->b:F

    .line 26
    .line 27
    iput-boolean v2, v3, Ldefpackage/zj4;->c:Z

    .line 28
    .line 29
    int-to-float p0, p1

    .line 30
    iget-boolean p1, v3, Ldefpackage/zj4;->f:Z

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iput p0, v3, Ldefpackage/zj4;->l:F

    .line 35
    .line 36
    return v2

    .line 37
    :cond_1
    iget-object p1, v3, Ldefpackage/zj4;->k:Ldefpackage/ak4;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, Ldefpackage/ak4;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Ldefpackage/ak4;-><init>(F)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v3, Ldefpackage/zj4;->k:Ldefpackage/ak4;

    .line 47
    .line 48
    :cond_2
    iget-object p1, v3, Ldefpackage/zj4;->k:Ldefpackage/ak4;

    .line 49
    .line 50
    float-to-double v4, p0

    .line 51
    iput-wide v4, p1, Ldefpackage/ak4;->i:D

    .line 52
    .line 53
    double-to-float p0, v4

    .line 54
    float-to-double v4, p0

    .line 55
    const-wide v6, 0x47efffffe0000000L    # 3.4028234663852886E38

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    cmpl-double p0, v4, v6

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    if-gtz p0, :cond_b

    .line 64
    .line 65
    const-wide v6, -0x3810000020000000L    # -3.4028234663852886E38

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    cmpg-double p0, v4, v6

    .line 71
    .line 72
    if-ltz p0, :cond_a

    .line 73
    .line 74
    iget p0, v3, Ldefpackage/zj4;->h:F

    .line 75
    .line 76
    const/high16 v4, 0x3f400000    # 0.75f

    .line 77
    .line 78
    mul-float/2addr p0, v4

    .line 79
    float-to-double v4, p0

    .line 80
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    iput-wide v4, p1, Ldefpackage/ak4;->d:D

    .line 85
    .line 86
    const-wide v6, 0x404f400000000000L    # 62.5

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    mul-double/2addr v4, v6

    .line 92
    iput-wide v4, p1, Ldefpackage/ak4;->e:D

    .line 93
    .line 94
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p0, p1, :cond_9

    .line 103
    .line 104
    iget-boolean p0, v3, Ldefpackage/zj4;->f:Z

    .line 105
    .line 106
    if-nez p0, :cond_8

    .line 107
    .line 108
    if-nez p0, :cond_8

    .line 109
    .line 110
    iput-boolean v2, v3, Ldefpackage/zj4;->f:Z

    .line 111
    .line 112
    iget-boolean p0, v3, Ldefpackage/zj4;->c:Z

    .line 113
    .line 114
    if-nez p0, :cond_3

    .line 115
    .line 116
    iget-object p0, v3, Ldefpackage/zj4;->e:Ldefpackage/fp0;

    .line 117
    .line 118
    iget-object p1, v3, Ldefpackage/zj4;->d:Ldefpackage/gp0;

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget p0, p1, Ldefpackage/gp0;->B:F

    .line 124
    .line 125
    mul-float/2addr p0, v1

    .line 126
    iput p0, v3, Ldefpackage/zj4;->b:F

    .line 127
    .line 128
    :cond_3
    iget p0, v3, Ldefpackage/zj4;->b:F

    .line 129
    .line 130
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 131
    .line 132
    .line 133
    cmpl-float p1, p0, p1

    .line 134
    .line 135
    if-gtz p1, :cond_7

    .line 136
    .line 137
    const p1, -0x800001

    .line 138
    .line 139
    .line 140
    cmpg-float p0, p0, p1

    .line 141
    .line 142
    if-ltz p0, :cond_7

    .line 143
    .line 144
    sget-object p0, Ldefpackage/td;->f:Ljava/lang/ThreadLocal;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-nez p1, :cond_4

    .line 151
    .line 152
    new-instance p1, Ldefpackage/td;

    .line 153
    .line 154
    invoke-direct {p1}, Ldefpackage/td;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_4
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, Ldefpackage/td;

    .line 165
    .line 166
    iget-object p1, p0, Ldefpackage/td;->b:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_6

    .line 173
    .line 174
    iget-object v0, p0, Ldefpackage/td;->d:Ldefpackage/yc5;

    .line 175
    .line 176
    if-nez v0, :cond_5

    .line 177
    .line 178
    new-instance v0, Ldefpackage/yc5;

    .line 179
    .line 180
    iget-object v1, p0, Ldefpackage/td;->c:Ldefpackage/zg5;

    .line 181
    .line 182
    invoke-direct {v0, v1}, Ldefpackage/yc5;-><init>(Ldefpackage/zg5;)V

    .line 183
    .line 184
    .line 185
    iput-object v0, p0, Ldefpackage/td;->d:Ldefpackage/yc5;

    .line 186
    .line 187
    :cond_5
    iget-object p0, p0, Ldefpackage/td;->d:Ldefpackage/yc5;

    .line 188
    .line 189
    iget-object v0, p0, Ldefpackage/yc5;->o:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Landroid/view/Choreographer;

    .line 192
    .line 193
    iget-object p0, p0, Ldefpackage/yc5;->p:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast p0, Ldefpackage/sd;

    .line 196
    .line 197
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 198
    .line 199
    .line 200
    :cond_6
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-nez p0, :cond_8

    .line 205
    .line 206
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    return v2

    .line 210
    :cond_7
    const-string p0, "Starting value need to be in between min value and max value"

    .line 211
    .line 212
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return v0

    .line 216
    :cond_8
    return v2

    .line 217
    :cond_9
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 218
    .line 219
    const-string p1, "Animations may only be started on the main thread"

    .line 220
    .line 221
    invoke-direct {p0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p0

    .line 225
    :cond_a
    const-string p0, "Final position of the spring cannot be less than the min value."

    .line 226
    .line 227
    invoke-static {p0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return v0

    .line 231
    :cond_b
    const-string p0, "Final position of the spring cannot be greater than the max value."

    .line 232
    .line 233
    invoke-static {p0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return v0
.end method
