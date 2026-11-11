.class public Lcom/skydoves/colorpickerview/ColorPickerView;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laa2;


# static fields
.field public static final synthetic H:I


# instance fields
.field public A:Z

.field public B:I

.field public C:Z

.field public D:Ljava/lang/String;

.field public E:Z

.field public F:Z

.field public final G:Lhg3;

.field public n:I

.field public o:I

.field public p:Landroid/graphics/Point;

.field public q:Landroid/widget/ImageView;

.field public r:Landroid/widget/ImageView;

.field public s:Landroid/graphics/drawable/Drawable;

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:Lh50;

.field public v:J

.field public final w:Landroid/os/Handler;

.field public x:Lc5;

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 54
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, 0x0

    .line 55
    iput-wide v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 56
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->w:Landroid/os/Handler;

    .line 57
    sget-object p1, Lc5;->n:Lc5;

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 58
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 59
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->z:F

    const/4 p1, 0x1

    .line 60
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->A:Z

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 62
    iput-boolean v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->C:Z

    .line 63
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->E:Z

    .line 64
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->F:Z

    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lhg3;->C(Landroid/content/Context;)Lhg3;

    move-result-object p1

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->G:Lhg3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 7
    .line 8
    new-instance p1, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->w:Landroid/os/Handler;

    .line 14
    .line 15
    sget-object p1, Lc5;->n:Lc5;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    .line 18
    .line 19
    const/high16 p1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 22
    .line 23
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->z:F

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->A:Z

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->C:Z

    .line 32
    .line 33
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->E:Z

    .line 34
    .line 35
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->F:Z

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lhg3;->C(Landroid/content/Context;)Lhg3;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->G:Lhg3;

    .line 46
    .line 47
    invoke-virtual {p0, p2}, Lcom/skydoves/colorpickerview/ColorPickerView;->c(Landroid/util/AttributeSet;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->g()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 66
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 v0, 0x0

    .line 67
    iput-wide v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 68
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->w:Landroid/os/Handler;

    .line 69
    sget-object p1, Lc5;->n:Lc5;

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 70
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 71
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->z:F

    const/4 p1, 0x1

    .line 72
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->A:Z

    const/4 p3, 0x0

    .line 73
    iput p3, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 74
    iput-boolean p3, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->C:Z

    .line 75
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->E:Z

    .line 76
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->F:Z

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lhg3;->C(Landroid/content/Context;)Lhg3;

    move-result-object p1

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->G:Lhg3;

    .line 78
    invoke-virtual {p0, p2}, Lcom/skydoves/colorpickerview/ColorPickerView;->c(Landroid/util/AttributeSet;)V

    .line 79
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->g()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 80
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const-wide/16 p3, 0x0

    .line 81
    iput-wide p3, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 82
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->w:Landroid/os/Handler;

    .line 83
    sget-object p1, Lc5;->n:Lc5;

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 84
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 85
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->z:F

    const/4 p1, 0x1

    .line 86
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->A:Z

    const/4 p3, 0x0

    .line 87
    iput p3, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 88
    iput-boolean p3, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->C:Z

    .line 89
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->E:Z

    .line 90
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->F:Z

    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lhg3;->C(Landroid/content/Context;)Lhg3;

    move-result-object p1

    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->G:Lhg3;

    .line 92
    invoke-virtual {p0, p2}, Lcom/skydoves/colorpickerview/ColorPickerView;->c(Landroid/util/AttributeSet;)V

    .line 93
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->g()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .line 1
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->o:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getAlphaSlideBar()Lo9;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getBrightnessSlider()Lyu;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->u:Lh50;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    instance-of p1, p1, Le50;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->o:I

    .line 18
    .line 19
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "%02X%02X%02X%02X"

    .line 60
    .line 61
    invoke-static {v4, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->u:Lh50;

    .line 78
    .line 79
    check-cast p1, Le50;

    .line 80
    .line 81
    iget-object p1, p1, Le50;->a:Ljx3;

    .line 82
    .line 83
    const-string v1, "HEX:#"

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p1, Ljx3;->n:Ljava/lang/Object;

    .line 90
    .line 91
    :cond_0
    iget-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->C:Z

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->C:Z

    .line 97
    .line 98
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 99
    .line 100
    if-eqz p1, :cond_1

    .line 101
    .line 102
    iget p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    .line 105
    .line 106
    .line 107
    :cond_1
    return-void
.end method

.method public final c(Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lit3;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x5

    .line 12
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->s:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    :goto_0
    const/16 v0, 0x8

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, -0x1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eq v0, v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1, v0}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->t:Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    :cond_1
    const/16 v0, 0xa

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iput v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 68
    .line 69
    :cond_2
    const/16 v0, 0xb

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 78
    .line 79
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iput v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 84
    .line 85
    :cond_3
    const/4 v0, 0x2

    .line 86
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    iget v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->z:F

    .line 93
    .line 94
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iput v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->z:F

    .line 99
    .line 100
    :cond_4
    const/4 v0, 0x3

    .line 101
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_5

    .line 106
    .line 107
    iget-boolean v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->A:Z

    .line 108
    .line 109
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iput-boolean v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->A:Z

    .line 114
    .line 115
    :cond_5
    const/4 v0, 0x0

    .line 116
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/4 v3, 0x1

    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_6

    .line 128
    .line 129
    sget-object v0, Lc5;->n:Lc5;

    .line 130
    .line 131
    iput-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    if-ne v0, v3, :cond_7

    .line 135
    .line 136
    sget-object v0, Lc5;->o:Lc5;

    .line 137
    .line 138
    iput-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    .line 139
    .line 140
    :cond_7
    :goto_1
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_8

    .line 145
    .line 146
    iget-wide v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 147
    .line 148
    long-to-int v0, v0

    .line 149
    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    int-to-long v0, v0

    .line 154
    iput-wide v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 155
    .line 156
    :cond_8
    const/4 v0, 0x6

    .line 157
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_9

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iput-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->D:Ljava/lang/String;

    .line 168
    .line 169
    :cond_9
    const/4 v0, 0x4

    .line 170
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_a

    .line 175
    .line 176
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {p0, v0}, Lcom/skydoves/colorpickerview/ColorPickerView;->setInitialColor(I)V

    .line 181
    .line 182
    .line 183
    :cond_a
    const/16 v0, 0x9

    .line 184
    .line 185
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_b

    .line 190
    .line 191
    iget-boolean v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->E:Z

    .line 192
    .line 193
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iput-boolean v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->E:Z

    .line 198
    .line 199
    :cond_b
    const/4 v0, 0x7

    .line 200
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_c

    .line 205
    .line 206
    iget-boolean v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->F:Z

    .line 207
    .line 208
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    iput-boolean v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->F:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    .line 214
    :cond_c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :goto_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 219
    .line 220
    .line 221
    throw p0
.end method

.method public final d(FF)I
    .locals 10

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    new-array v2, v1, [F

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput p1, v2, v3

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    aput p2, v2, v4

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    aget v0, v2, v3

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    cmpl-float v6, v0, v5

    .line 49
    .line 50
    if-ltz v6, :cond_1

    .line 51
    .line 52
    aget v6, v2, v4

    .line 53
    .line 54
    cmpl-float v6, v6, v5

    .line 55
    .line 56
    if-ltz v6, :cond_1

    .line 57
    .line 58
    iget-object v6, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 59
    .line 60
    invoke-virtual {v6}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    int-to-float v6, v6

    .line 69
    cmpg-float v0, v0, v6

    .line 70
    .line 71
    if-gez v0, :cond_1

    .line 72
    .line 73
    aget v0, v2, v4

    .line 74
    .line 75
    iget-object v6, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 76
    .line 77
    invoke-virtual {v6}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    int-to-float v6, v6

    .line 86
    cmpg-float v0, v0, v6

    .line 87
    .line 88
    if-gez v0, :cond_1

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    instance-of v0, v0, Lb50;

    .line 100
    .line 101
    if-eqz v0, :cond_0

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    int-to-float v0, v0

    .line 108
    const/high16 v2, 0x3f000000    # 0.5f

    .line 109
    .line 110
    mul-float/2addr v0, v2

    .line 111
    sub-float/2addr p1, v0

    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    int-to-float v0, v0

    .line 117
    mul-float/2addr v0, v2

    .line 118
    sub-float/2addr p2, v0

    .line 119
    mul-float v0, p1, p1

    .line 120
    .line 121
    mul-float v6, p2, p2

    .line 122
    .line 123
    add-float/2addr v6, v0

    .line 124
    float-to-double v6, v6

    .line 125
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    .line 126
    .line 127
    .line 128
    move-result-wide v6

    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    int-to-float p0, p0

    .line 142
    mul-float/2addr p0, v2

    .line 143
    const/4 v0, 0x3

    .line 144
    new-array v0, v0, [F

    .line 145
    .line 146
    aput v5, v0, v3

    .line 147
    .line 148
    aput v5, v0, v4

    .line 149
    .line 150
    const/high16 v2, 0x3f800000    # 1.0f

    .line 151
    .line 152
    aput v2, v0, v1

    .line 153
    .line 154
    float-to-double v8, p2

    .line 155
    neg-float p1, p1

    .line 156
    float-to-double p1, p1

    .line 157
    invoke-static {v8, v9, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    .line 158
    .line 159
    .line 160
    move-result-wide p1

    .line 161
    const-wide v8, 0x400921fb54442d18L    # Math.PI

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    div-double/2addr p1, v8

    .line 167
    const-wide v8, 0x4066800000000000L    # 180.0

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    mul-double/2addr p1, v8

    .line 173
    double-to-float p1, p1

    .line 174
    const/high16 p2, 0x43340000    # 180.0f

    .line 175
    .line 176
    add-float/2addr p1, p2

    .line 177
    aput p1, v0, v3

    .line 178
    .line 179
    float-to-double p0, p0

    .line 180
    div-double/2addr v6, p0

    .line 181
    double-to-float p0, v6

    .line 182
    invoke-static {v2, p0}, Ljava/lang/Math;->min(FF)F

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    invoke-static {v5, p0}, Ljava/lang/Math;->max(FF)F

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    aput p0, v0, v4

    .line 191
    .line 192
    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    return p0

    .line 197
    :cond_0
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 198
    .line 199
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    aget p2, v2, v3

    .line 208
    .line 209
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    int-to-float v0, v0

    .line 214
    div-float/2addr p2, v0

    .line 215
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 222
    .line 223
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    int-to-float v0, v0

    .line 232
    mul-float/2addr p2, v0

    .line 233
    float-to-int p2, p2

    .line 234
    aget v0, v2, v4

    .line 235
    .line 236
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    int-to-float p1, p1

    .line 241
    div-float/2addr v0, p1

    .line 242
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 243
    .line 244
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 249
    .line 250
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    int-to-float p1, p1

    .line 259
    mul-float/2addr v0, p1

    .line 260
    float-to-int p1, v0

    .line 261
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 262
    .line 263
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 268
    .line 269
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-virtual {p0, p2, p1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    return p0

    .line 278
    :cond_1
    return v3
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p0, p0, Lb50;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final f(Landroid/graphics/Point;)V
    .locals 3

    .line 1
    iget v0, p1, Landroid/graphics/Point;->x:I

    .line 2
    .line 3
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 4
    .line 5
    new-instance v1, Landroid/graphics/Point;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    div-int/lit8 v2, v2, 0x2

    .line 14
    .line 15
    sub-int/2addr v0, v2

    .line 16
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    div-int/lit8 p0, p0, 0x2

    .line 23
    .line 24
    sub-int/2addr p1, p0

    .line 25
    invoke-direct {v1, v0, p1}, Landroid/graphics/Point;-><init>(II)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final g()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->s:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x11

    .line 30
    .line 31
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 32
    .line 33
    iget-object v2, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-virtual {p0, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {v0, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 48
    .line 49
    iget-object v2, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->t:Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const v3, 0x7f080090

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 72
    .line 73
    const/4 v2, -0x2

    .line 74
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 75
    .line 76
    .line 77
    iget v2, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 78
    .line 79
    if-eqz v2, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget v3, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 96
    .line 97
    int-to-float v3, v3

    .line 98
    mul-float/2addr v3, v2

    .line 99
    const/high16 v2, 0x3f000000    # 0.5f

    .line 100
    .line 101
    add-float/2addr v3, v2

    .line 102
    float-to-int v3, v3

    .line 103
    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iget v4, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->B:I

    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 120
    .line 121
    int-to-float v4, v4

    .line 122
    mul-float/2addr v4, v3

    .line 123
    add-float/2addr v4, v2

    .line 124
    float-to-int v2, v4

    .line 125
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 126
    .line 127
    :cond_2
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 128
    .line 129
    iget-object v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 130
    .line 131
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 135
    .line 136
    iget v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v1, Lsg;

    .line 146
    .line 147
    const/4 v2, 0x3

    .line 148
    invoke-direct {v1, v2, p0}, Lsg;-><init>(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public getActionMode()Lc5;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAlpha()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getColor()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-float p0, p0

    .line 10
    const/high16 v0, 0x437f0000    # 255.0f

    .line 11
    .line 12
    div-float/2addr p0, v0

    .line 13
    return p0
.end method

.method public getAlphaSlideBar()Lo9;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getBrightnessSlider()Lyu;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getColor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->o:I

    .line 2
    .line 3
    return p0
.end method

.method public getColorEnvelope()La50;
    .locals 6

    .line 1
    new-instance v0, La50;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getColor()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "%02X%02X%02X%02X"

    .line 51
    .line 52
    invoke-static {v5, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 65
    .line 66
    .line 67
    return-object v0
.end method

.method public getDebounceDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getFlagView()Lx71;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getPreferenceName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->D:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPureColor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->n:I

    .line 2
    .line 3
    return p0
.end method

.method public getSelectedPoint()Landroid/graphics/Point;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSelector()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSelectorX()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    int-to-float p0, p0

    .line 14
    const/high16 v1, 0x3f000000    # 0.5f

    .line 15
    .line 16
    mul-float/2addr p0, v1

    .line 17
    sub-float/2addr v0, p0

    .line 18
    return v0
.end method

.method public getSelectorY()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    int-to-float p0, p0

    .line 14
    const/high16 v1, 0x3f000000    # 0.5f

    .line 15
    .line 16
    mul-float/2addr p0, v1

    .line 17
    sub-float/2addr v0, p0

    .line 18
    return v0
.end method

.method public final h(I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v0, v0, Lb50;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    new-array v0, v0, [F

    .line 13
    .line 14
    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-float v1, v1

    .line 22
    const/high16 v2, 0x3f000000    # 0.5f

    .line 23
    .line 24
    mul-float/2addr v1, v2

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    int-to-float v3, v3

    .line 30
    mul-float/2addr v3, v2

    .line 31
    const/4 v2, 0x1

    .line 32
    aget v2, v0, v2

    .line 33
    .line 34
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    mul-float/2addr v4, v2

    .line 39
    float-to-double v5, v4

    .line 40
    const/4 v2, 0x0

    .line 41
    aget v7, v0, v2

    .line 42
    .line 43
    float-to-double v7, v7

    .line 44
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v7

    .line 52
    mul-double/2addr v7, v5

    .line 53
    float-to-double v5, v1

    .line 54
    add-double/2addr v7, v5

    .line 55
    double-to-int v1, v7

    .line 56
    neg-float v4, v4

    .line 57
    float-to-double v4, v4

    .line 58
    aget v0, v0, v2

    .line 59
    .line 60
    float-to-double v6, v0

    .line 61
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v6

    .line 65
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    mul-double/2addr v6, v4

    .line 70
    float-to-double v2, v3

    .line 71
    add-double/2addr v6, v2

    .line 72
    double-to-int v0, v6

    .line 73
    new-instance v2, Landroid/graphics/Point;

    .line 74
    .line 75
    invoke-direct {v2, v1, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0, v2}, Lkb4;->z(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->n:I

    .line 83
    .line 84
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->o:I

    .line 85
    .line 86
    new-instance p1, Landroid/graphics/Point;

    .line 87
    .line 88
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 89
    .line 90
    iget v2, v0, Landroid/graphics/Point;->y:I

    .line 91
    .line 92
    invoke-direct {p1, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getAlphaSlideBar()Lo9;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getBrightnessSlider()Lyu;

    .line 101
    .line 102
    .line 103
    iget p1, v0, Landroid/graphics/Point;->x:I

    .line 104
    .line 105
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 106
    .line 107
    invoke-virtual {p0, p1, v0}, Lcom/skydoves/colorpickerview/ColorPickerView;->i(II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getColor()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-virtual {p0, p1}, Lcom/skydoves/colorpickerview/ColorPickerView;->a(I)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lcom/skydoves/colorpickerview/ColorPickerView;->f(Landroid/graphics/Point;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_0
    new-instance p0, Ljava/lang/IllegalAccessException;

    .line 124
    .line 125
    const-string p1, "selectByHsvColor(@ColorInt int color) can be called only when the palette is an instance of ColorHsvPalette. Use setHsvPaletteDrawable();"

    .line 126
    .line 127
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p0
.end method

.method public final i(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    int-to-float v1, v1

    .line 9
    const/high16 v2, 0x3f000000    # 0.5f

    .line 10
    .line 11
    mul-float/2addr v1, v2

    .line 12
    sub-float/2addr p1, v1

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setX(F)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 17
    .line 18
    int-to-float p1, p2

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    int-to-float p2, p2

    .line 24
    mul-float/2addr p2, v2

    .line 25
    sub-float/2addr p1, p2

    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setY(F)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onDestroy()V
    .locals 6
    .annotation runtime Lf93;
        value = .enum Lq92;->ON_DESTROY:Lq92;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->G:Lhg3;

    .line 2
    .line 3
    iget-object v0, v0, Lhg3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/content/SharedPreferences;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getColor()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v5, "_COLOR"

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getSelectedPoint()Landroid/graphics/Point;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v5, "_SELECTOR_X"

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    iget v5, v2, Landroid/graphics/Point;->x:I

    .line 78
    .line 79
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, "_SELECTOR_Y"

    .line 99
    .line 100
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 108
    .line 109
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 114
    .line 115
    .line 116
    :goto_0
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getAlphaSlideBar()Lo9;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getBrightnessSlider()Lyu;

    .line 120
    .line 121
    .line 122
    :cond_1
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 5
    .line 6
    invoke-virtual {p3}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 19
    .line 20
    new-instance p3, Lb50;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {p3, p0, p1}, Lb50;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-eq v0, v3, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getFlagView()Lx71;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Landroid/graphics/Point;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    float-to-int v1, v1

    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    float-to-int v3, v3

    .line 47
    invoke-direct {v0, v1, v3}, Landroid/graphics/Point;-><init>(II)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v0}, Lkb4;->z(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 55
    .line 56
    int-to-float v1, v1

    .line 57
    iget v3, v0, Landroid/graphics/Point;->y:I

    .line 58
    .line 59
    int-to-float v3, v3

    .line 60
    invoke-virtual {p0, v1, v3}, Lcom/skydoves/colorpickerview/ColorPickerView;->d(FF)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iput v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->n:I

    .line 65
    .line 66
    iput v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->o:I

    .line 67
    .line 68
    new-instance v1, Landroid/graphics/Point;

    .line 69
    .line 70
    iget v3, v0, Landroid/graphics/Point;->x:I

    .line 71
    .line 72
    iget v4, v0, Landroid/graphics/Point;->y:I

    .line 73
    .line 74
    invoke-direct {v1, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v1}, Lkb4;->z(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 82
    .line 83
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 84
    .line 85
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 86
    .line 87
    invoke-virtual {p0, v1, v0}, Lcom/skydoves/colorpickerview/ColorPickerView;->i(II)V

    .line 88
    .line 89
    .line 90
    iget-boolean v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->F:Z

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->e()Z

    .line 95
    .line 96
    .line 97
    :cond_2
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    .line 98
    .line 99
    sget-object v1, Lc5;->o:Lc5;

    .line 100
    .line 101
    const/16 v3, 0xc

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    iget-object v5, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->w:Landroid/os/Handler;

    .line 105
    .line 106
    if-ne v0, v1, :cond_4

    .line 107
    .line 108
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lcom/skydoves/colorpickerview/ColorPickerView;->f(Landroid/graphics/Point;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-ne p1, v2, :cond_3

    .line 118
    .line 119
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, La0;

    .line 123
    .line 124
    invoke-direct {p1, v3, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-wide v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 128
    .line 129
    invoke-virtual {v5, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 130
    .line 131
    .line 132
    :cond_3
    return v2

    .line 133
    :cond_4
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    new-instance p1, La0;

    .line 137
    .line 138
    invoke-direct {p1, v3, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-wide v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 142
    .line 143
    invoke-virtual {v5, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 144
    .line 145
    .line 146
    return v2
.end method

.method public setActionMode(Lc5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->x:Lc5;

    .line 2
    .line 3
    return-void
.end method

.method public setColorListener(Lh50;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->u:Lh50;

    .line 2
    .line 3
    return-void
.end method

.method public setDebounceDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->v:J

    .line 2
    .line 3
    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x4

    .line 11
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getAlphaSlideBar()Lo9;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getBrightnessSlider()Lyu;

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/widget/ImageView;->clearColorFilter()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const/16 p1, 0x46

    .line 29
    .line 30
    const/16 v0, 0xff

    .line 31
    .line 32
    invoke-static {p1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public setFlagView(Lx71;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public setInitialColor(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->G:Lhg3;

    .line 18
    .line 19
    iget-object v1, v1, Lhg3;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Landroid/content/SharedPreferences;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, "_COLOR"

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v2, -0x1

    .line 41
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-ne v0, v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-void

    .line 49
    :cond_1
    :goto_0
    new-instance v0, Lg50;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, p0, p1, v1}, Lg50;-><init>(Lcom/skydoves/colorpickerview/ColorPickerView;II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public setInitialColorRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getColor(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/skydoves/colorpickerview/ColorPickerView;->setInitialColor(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setLifecycleOwner(Lba2;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lba2;->h()Lea2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p0}, Lea2;->a(Laa2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPaletteDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/widget/ImageView;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->s:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, -0x1

    .line 38
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->n:I

    .line 39
    .line 40
    iget-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->C:Z

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->C:Z

    .line 46
    .line 47
    iget-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->y:F

    .line 56
    .line 57
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method public setPreferenceName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->D:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPureColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public setResetBrightnessOnLowSaturation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->F:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSelectorDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->r:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSelectorPointValidation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/skydoves/colorpickerview/ColorPickerView;->E:Z

    .line 2
    .line 3
    return-void
.end method
