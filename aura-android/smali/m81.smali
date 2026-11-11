.class public abstract Lm81;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final A:I

.field public static final B:I

.field public static final C:[I

.field public static final D:[I

.field public static final E:[I

.field public static final F:[I

.field public static final G:[I

.field public static final H:[I

.field public static final x:La61;

.field public static final y:I

.field public static final z:I


# instance fields
.field public a:Lbc4;

.field public b:Ln81;

.field public c:Landroid/graphics/drawable/RippleDrawable;

.field public d:Lnt;

.field public e:Landroid/graphics/drawable/RippleDrawable;

.field public f:Z

.field public g:Z

.field public h:F

.field public i:F

.field public j:F

.field public k:I

.field public l:Landroid/animation/Animator;

.field public m:Lzx2;

.field public n:Lzx2;

.field public o:F

.field public p:I

.field public q:I

.field public final r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public final s:Lzh0;

.field public final t:Landroid/graphics/Rect;

.field public final u:Landroid/graphics/RectF;

.field public final v:Landroid/graphics/RectF;

.field public final w:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lyd;->c:La61;

    .line 2
    .line 3
    sput-object v0, Lm81;->x:La61;

    .line 4
    .line 5
    const v0, 0x7f04038f

    .line 6
    .line 7
    .line 8
    sput v0, Lm81;->y:I

    .line 9
    .line 10
    const v0, 0x7f04039f

    .line 11
    .line 12
    .line 13
    sput v0, Lm81;->z:I

    .line 14
    .line 15
    const v0, 0x7f040392

    .line 16
    .line 17
    .line 18
    sput v0, Lm81;->A:I

    .line 19
    .line 20
    const v0, 0x7f04039d

    .line 21
    .line 22
    .line 23
    sput v0, Lm81;->B:I

    .line 24
    .line 25
    const v0, 0x10100a7

    .line 26
    .line 27
    .line 28
    const v1, 0x101009e

    .line 29
    .line 30
    .line 31
    filled-new-array {v0, v1}, [I

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lm81;->C:[I

    .line 36
    .line 37
    const v0, 0x1010367

    .line 38
    .line 39
    .line 40
    const v2, 0x101009c

    .line 41
    .line 42
    .line 43
    filled-new-array {v0, v2, v1}, [I

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sput-object v3, Lm81;->D:[I

    .line 48
    .line 49
    filled-new-array {v2, v1}, [I

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    sput-object v2, Lm81;->E:[I

    .line 54
    .line 55
    filled-new-array {v0, v1}, [I

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lm81;->F:[I

    .line 60
    .line 61
    filled-new-array {v1}, [I

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lm81;->G:[I

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    new-array v0, v0, [I

    .line 69
    .line 70
    sput-object v0, Lm81;->H:[I

    .line 71
    .line 72
    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lzh0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lm81;->g:Z

    .line 6
    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iput v1, p0, Lm81;->o:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lm81;->q:I

    .line 13
    .line 14
    new-instance v2, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lm81;->t:Landroid/graphics/Rect;

    .line 20
    .line 21
    new-instance v2, Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lm81;->u:Landroid/graphics/RectF;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Lm81;->v:Landroid/graphics/RectF;

    .line 34
    .line 35
    new-instance v2, Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lm81;->w:Landroid/graphics/Matrix;

    .line 41
    .line 42
    iput-object p1, p0, Lm81;->r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 43
    .line 44
    iput-object p2, p0, Lm81;->s:Lzh0;

    .line 45
    .line 46
    new-instance p2, Lhd5;

    .line 47
    .line 48
    const/16 v2, 0x14

    .line 49
    .line 50
    invoke-direct {p2, v2}, Lhd5;-><init>(I)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Lk81;

    .line 54
    .line 55
    check-cast p0, Lo81;

    .line 56
    .line 57
    invoke-direct {v2, p0, v0}, Lk81;-><init>(Lo81;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lm81;->d(Ll81;)Landroid/animation/ValueAnimator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p2, v0}, Lhd5;->f(Landroid/animation/ValueAnimator;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lk81;

    .line 68
    .line 69
    invoke-direct {v0, p0, v1}, Lk81;-><init>(Lo81;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lm81;->d(Ll81;)Landroid/animation/ValueAnimator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p2, v0}, Lhd5;->f(Landroid/animation/ValueAnimator;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Lk81;

    .line 80
    .line 81
    invoke-direct {v0, p0, v1}, Lk81;-><init>(Lo81;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lm81;->d(Ll81;)Landroid/animation/ValueAnimator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p2, v0}, Lhd5;->f(Landroid/animation/ValueAnimator;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Lk81;

    .line 92
    .line 93
    invoke-direct {v0, p0, v1}, Lk81;-><init>(Lo81;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lm81;->d(Ll81;)Landroid/animation/ValueAnimator;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p2, v0}, Lhd5;->f(Landroid/animation/ValueAnimator;)V

    .line 101
    .line 102
    .line 103
    new-instance v0, Lk81;

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    invoke-direct {v0, p0, v1}, Lk81;-><init>(Lo81;I)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, Lm81;->d(Ll81;)Landroid/animation/ValueAnimator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p2, v0}, Lhd5;->f(Landroid/animation/ValueAnimator;)V

    .line 114
    .line 115
    .line 116
    new-instance v0, Lj81;

    .line 117
    .line 118
    invoke-direct {v0, p0}, Ll81;-><init>(Lo81;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lm81;->d(Ll81;)Landroid/animation/ValueAnimator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p2, p0}, Lhd5;->f(Landroid/animation/ValueAnimator;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/view/View;->getRotation()F

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static d(Ll81;)Landroid/animation/ValueAnimator;
    .locals 3

    .line 1
    new-instance v0, Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lm81;->x:La61;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0x64

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x2

    .line 23
    new-array p0, p0, [F

    .line 24
    .line 25
    fill-array-data p0, :array_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a(FLandroid/graphics/Matrix;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm81;->r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v1, p0, Lm81;->p:I

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    int-to-float v1, v1

    .line 21
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-float v0, v0

    .line 26
    iget-object v2, p0, Lm81;->u:Landroid/graphics/RectF;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v2, v3, v3, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lm81;->p:I

    .line 33
    .line 34
    int-to-float v0, v0

    .line 35
    iget-object v1, p0, Lm81;->v:Landroid/graphics/RectF;

    .line 36
    .line 37
    invoke-virtual {v1, v3, v3, v0, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 41
    .line 42
    invoke-virtual {p2, v2, v1, v0}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 43
    .line 44
    .line 45
    iget p0, p0, Lm81;->p:I

    .line 46
    .line 47
    int-to-float p0, p0

    .line 48
    const/high16 v0, 0x40000000    # 2.0f

    .line 49
    .line 50
    div-float/2addr p0, v0

    .line 51
    invoke-virtual {p2, p1, p1, p0, p0}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final b(Lzx2;FFF)Landroid/animation/AnimatorSet;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    new-array v3, v2, [F

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    aput p2, v3, v4

    .line 13
    .line 14
    iget-object p2, p0, Lm81;->r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 15
    .line 16
    invoke-static {p2, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v3, "opacity"

    .line 21
    .line 22
    invoke-virtual {p1, v3}, Lzx2;->f(Ljava/lang/String;)Lay2;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v1}, Lay2;->a(Landroid/animation/ObjectAnimator;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    sget-object v1, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 33
    .line 34
    new-array v3, v2, [F

    .line 35
    .line 36
    aput p3, v3, v4

    .line 37
    .line 38
    invoke-static {p2, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v3, "scale"

    .line 43
    .line 44
    invoke-virtual {p1, v3}, Lzx2;->f(Ljava/lang/String;)Lay2;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5, v1}, Lay2;->a(Landroid/animation/ObjectAnimator;)V

    .line 49
    .line 50
    .line 51
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v6, 0x1a

    .line 54
    .line 55
    if-eq v5, v6, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v7, Li81;

    .line 59
    .line 60
    invoke-direct {v7}, Li81;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v8, Landroid/animation/FloatEvaluator;

    .line 64
    .line 65
    invoke-direct {v8}, Landroid/animation/FloatEvaluator;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v8, v7, Li81;->b:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v1, v7}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    sget-object v1, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 77
    .line 78
    new-array v2, v2, [F

    .line 79
    .line 80
    aput p3, v2, v4

    .line 81
    .line 82
    invoke-static {p2, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-virtual {p1, v3}, Lzx2;->f(Ljava/lang/String;)Lay2;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1, p3}, Lay2;->a(Landroid/animation/ObjectAnimator;)V

    .line 91
    .line 92
    .line 93
    if-eq v5, v6, :cond_1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    new-instance v1, Li81;

    .line 97
    .line 98
    invoke-direct {v1}, Li81;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v2, Landroid/animation/FloatEvaluator;

    .line 102
    .line 103
    invoke-direct {v2}, Landroid/animation/FloatEvaluator;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v2, v1, Li81;->b:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-virtual {p3, v1}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    iget-object p3, p0, Lm81;->w:Landroid/graphics/Matrix;

    .line 115
    .line 116
    invoke-virtual {p0, p4, p3}, Lm81;->a(FLandroid/graphics/Matrix;)V

    .line 117
    .line 118
    .line 119
    new-instance p4, Lcq;

    .line 120
    .line 121
    invoke-direct {p4}, Lcq;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v1, Lg81;

    .line 125
    .line 126
    invoke-direct {v1, p0}, Lg81;-><init>(Lm81;)V

    .line 127
    .line 128
    .line 129
    new-instance p0, Landroid/graphics/Matrix;

    .line 130
    .line 131
    invoke-direct {p0, p3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 132
    .line 133
    .line 134
    filled-new-array {p0}, [Landroid/graphics/Matrix;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p2, p4, v1, p0}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    const-string p2, "iconScale"

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Lzx2;->f(Ljava/lang/String;)Lay2;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1, p0}, Lay2;->a(Landroid/animation/ObjectAnimator;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    new-instance p0, Landroid/animation/AnimatorSet;

    .line 155
    .line 156
    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-static {p0, v0}, Lgi1;->R(Landroid/animation/AnimatorSet;Ljava/util/ArrayList;)V

    .line 160
    .line 161
    .line 162
    return-object p0
.end method

.method public final c(FFFII)Landroid/animation/AnimatorSet;
    .locals 14

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    new-array v2, v2, [F

    .line 13
    .line 14
    fill-array-data v2, :array_0

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lm81;->r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v3}, Landroid/view/View;->getScaleX()F

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    invoke-virtual {v3}, Landroid/view/View;->getScaleY()F

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    iget v11, p0, Lm81;->o:F

    .line 36
    .line 37
    new-instance v13, Landroid/graphics/Matrix;

    .line 38
    .line 39
    iget-object v4, p0, Lm81;->w:Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-direct {v13, v4}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 42
    .line 43
    .line 44
    new-instance v4, Lh81;

    .line 45
    .line 46
    move-object v5, p0

    .line 47
    move v7, p1

    .line 48
    move/from16 v9, p2

    .line 49
    .line 50
    move/from16 v12, p3

    .line 51
    .line 52
    invoke-direct/range {v4 .. v13}, Lh81;-><init>(Lm81;FFFFFFFLandroid/graphics/Matrix;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lgi1;->R(Landroid/animation/AnimatorSet;Ljava/util/ArrayList;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const v1, 0x7f0b002b

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    move/from16 v1, p4

    .line 84
    .line 85
    invoke-static {p0, v1, p1}, Lg12;->N(Landroid/content/Context;II)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    int-to-long p0, p0

    .line 90
    invoke-virtual {v0, p0, p1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget-object p1, Lyd;->b:La61;

    .line 98
    .line 99
    move/from16 v1, p5

    .line 100
    .line 101
    invoke-static {p0, v1, p1}, Lg12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public abstract e(FFF)V
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Lbc4;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lm81;->a:Lbc4;

    .line 2
    .line 3
    iget-object v0, p0, Lm81;->b:Ln81;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lfi2;->setShapeAppearanceModel(Lbc4;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lm81;->c:Landroid/graphics/drawable/RippleDrawable;

    .line 11
    .line 12
    instance-of v1, v0, Llc4;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Llc4;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Llc4;->setShapeAppearanceModel(Lbc4;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object p0, p0, Lm81;->d:Lnt;

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iput-object p1, p0, Lnt;->o:Lbc4;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 28
    .line 29
    .line 30
    :cond_2
    return-void
.end method

.method public final h()V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lo81;

    .line 3
    .line 4
    iget-object v1, v0, Lm81;->s:Lzh0;

    .line 5
    .line 6
    iget-object v2, v1, Lzh0;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 9
    .line 10
    iget-boolean v2, v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->x:Z

    .line 11
    .line 12
    iget-boolean v3, v0, Lm81;->f:Z

    .line 13
    .line 14
    iget-object v4, p0, Lm81;->t:Landroid/graphics/Rect;

    .line 15
    .line 16
    iget-object v5, v0, Lm81;->r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v2, v0, Lm81;->k:I

    .line 24
    .line 25
    invoke-virtual {v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sub-int/2addr v2, v3

    .line 30
    div-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    :cond_0
    iget-boolean v2, v0, Lm81;->g:Z

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v5}, Landroid/view/View;->getElevation()F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget v3, v0, Lm81;->j:F

    .line 45
    .line 46
    add-float/2addr v2, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v2, 0x0

    .line 49
    :goto_0
    float-to-double v7, v2

    .line 50
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 51
    .line 52
    .line 53
    move-result-wide v7

    .line 54
    double-to-int v3, v7

    .line 55
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 60
    .line 61
    mul-float/2addr v2, v7

    .line 62
    float-to-double v7, v2

    .line 63
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    double-to-int v2, v7

    .line 68
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {v4, v3, v2, v3, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    if-eqz v3, :cond_4

    .line 77
    .line 78
    invoke-virtual {v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget v3, v0, Lm81;->k:I

    .line 83
    .line 84
    if-lt v2, v3, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    sub-int/2addr v3, v2

    .line 92
    div-int/lit8 v3, v3, 0x2

    .line 93
    .line 94
    invoke-virtual {v4, v3, v3, v3, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    :goto_1
    invoke-virtual {v4, v6, v6, v6, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 99
    .line 100
    .line 101
    :goto_2
    iget-object v2, p0, Lm81;->e:Landroid/graphics/drawable/RippleDrawable;

    .line 102
    .line 103
    const-string v3, "Didn\'t initialize content background"

    .line 104
    .line 105
    invoke-static {v2, v3}, Ll93;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, v1, Lzh0;->o:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 111
    .line 112
    iget-boolean v1, v1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->x:Z

    .line 113
    .line 114
    iget-object v2, p0, Lm81;->s:Lzh0;

    .line 115
    .line 116
    if-nez v1, :cond_7

    .line 117
    .line 118
    iget-boolean v1, v0, Lm81;->f:Z

    .line 119
    .line 120
    if-eqz v1, :cond_5

    .line 121
    .line 122
    invoke-virtual {v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    iget v0, v0, Lm81;->k:I

    .line 127
    .line 128
    if-lt v1, v0, :cond_7

    .line 129
    .line 130
    :cond_5
    iget-object p0, p0, Lm81;->e:Landroid/graphics/drawable/RippleDrawable;

    .line 131
    .line 132
    if-eqz p0, :cond_6

    .line 133
    .line 134
    iget-object v0, v2, Lzh0;->o:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 137
    .line 138
    invoke-static {v0, p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    new-instance v5, Landroid/graphics/drawable/InsetDrawable;

    .line 147
    .line 148
    iget-object v6, p0, Lm81;->e:Landroid/graphics/drawable/RippleDrawable;

    .line 149
    .line 150
    iget v7, v4, Landroid/graphics/Rect;->left:I

    .line 151
    .line 152
    iget v8, v4, Landroid/graphics/Rect;->top:I

    .line 153
    .line 154
    iget v9, v4, Landroid/graphics/Rect;->right:I

    .line 155
    .line 156
    iget v10, v4, Landroid/graphics/Rect;->bottom:I

    .line 157
    .line 158
    invoke-direct/range {v5 .. v10}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 159
    .line 160
    .line 161
    iget-object p0, v2, Lzh0;->o:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 164
    .line 165
    invoke-static {p0, v5}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V

    .line 166
    .line 167
    .line 168
    :goto_3
    iget p0, v4, Landroid/graphics/Rect;->left:I

    .line 169
    .line 170
    iget v0, v4, Landroid/graphics/Rect;->top:I

    .line 171
    .line 172
    iget v1, v4, Landroid/graphics/Rect;->right:I

    .line 173
    .line 174
    iget v3, v4, Landroid/graphics/Rect;->bottom:I

    .line 175
    .line 176
    iget-object v2, v2, Lzh0;->o:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 179
    .line 180
    iget-object v4, v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->y:Landroid/graphics/Rect;

    .line 181
    .line 182
    invoke-virtual {v4, p0, v0, v1, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 183
    .line 184
    .line 185
    iget v4, v2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->v:I

    .line 186
    .line 187
    add-int/2addr p0, v4

    .line 188
    add-int/2addr v0, v4

    .line 189
    add-int/2addr v1, v4

    .line 190
    add-int/2addr v3, v4

    .line 191
    invoke-virtual {v2, p0, v0, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 192
    .line 193
    .line 194
    return-void
.end method
