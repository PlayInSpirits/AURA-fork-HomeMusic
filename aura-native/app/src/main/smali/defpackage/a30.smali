.class public final Ldefpackage/a30;
.super Ldefpackage/rx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final l:[I

.field public static final m:[I

.field public static final n:[I

.field public static final o:Ldefpackage/r00;

.field public static final p:Ldefpackage/r00;


# instance fields
.field public d:Landroid/animation/ObjectAnimator;

.field public e:Landroid/animation/ObjectAnimator;

.field public final f:Ldefpackage/a61;

.field public final g:Ldefpackage/g30;

.field public h:I

.field public i:F

.field public j:F

.field public k:Ldefpackage/hq;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xa8c

    .line 2
    .line 3
    const/16 v1, 0xfd2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x546

    .line 7
    .line 8
    filled-new-array {v2, v3, v0, v1}, [I

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Ldefpackage/a30;->l:[I

    .line 13
    .line 14
    const/16 v0, 0xd27

    .line 15
    .line 16
    const/16 v1, 0x126d

    .line 17
    .line 18
    const/16 v2, 0x29b

    .line 19
    .line 20
    const/16 v3, 0x7e1

    .line 21
    .line 22
    filled-new-array {v2, v3, v0, v1}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Ldefpackage/a30;->m:[I

    .line 27
    .line 28
    const/16 v0, 0xe74

    .line 29
    .line 30
    const/16 v1, 0x13ba

    .line 31
    .line 32
    const/16 v2, 0x3e8

    .line 33
    .line 34
    const/16 v3, 0x92e

    .line 35
    .line 36
    filled-new-array {v2, v3, v0, v1}, [I

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Ldefpackage/a30;->n:[I

    .line 41
    .line 42
    new-instance v0, Ldefpackage/r00;

    .line 43
    .line 44
    const-string v1, "animationFraction"

    .line 45
    .line 46
    const/4 v2, 0x5

    .line 47
    const-class v3, Ljava/lang/Float;

    .line 48
    .line 49
    invoke-direct {v0, v3, v1, v2}, Ldefpackage/r00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Ldefpackage/a30;->o:Ldefpackage/r00;

    .line 53
    .line 54
    new-instance v0, Ldefpackage/r00;

    .line 55
    .line 56
    const-string v1, "completeEndFraction"

    .line 57
    .line 58
    const/4 v2, 0x6

    .line 59
    invoke-direct {v0, v3, v1, v2}, Ldefpackage/r00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Ldefpackage/a30;->p:Ldefpackage/r00;

    .line 63
    .line 64
    return-void
.end method

.method public constructor <init>(Ldefpackage/g30;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Ldefpackage/rx1;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Ldefpackage/a30;->h:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldefpackage/a30;->k:Ldefpackage/hq;

    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/a30;->g:Ldefpackage/g30;

    .line 12
    .line 13
    new-instance p1, Ldefpackage/a61;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-direct {p1, v0}, Ldefpackage/a61;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ldefpackage/a30;->f:Ldefpackage/a61;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/a30;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/animation/Animator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/a30;->h:I

    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 5
    .line 6
    check-cast v1, [I

    .line 7
    .line 8
    iget-object v2, p0, Ldefpackage/a30;->g:Ldefpackage/g30;

    .line 9
    .line 10
    iget-object v2, v2, Ldefpackage/jq;->c:[I

    .line 11
    .line 12
    aget v2, v2, v0

    .line 13
    .line 14
    iget-object v3, p0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Ldefpackage/sx1;

    .line 17
    .line 18
    iget v3, v3, Ldefpackage/cw0;->w:I

    .line 19
    .line 20
    invoke-static {v2, v3}, Ldefpackage/g12;->l(II)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    aput v2, v1, v0

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput v0, p0, Ldefpackage/a30;->j:F

    .line 28
    .line 29
    return-void
.end method

.method public final g(Ldefpackage/hq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/a30;->k:Ldefpackage/hq;

    .line 2
    .line 3
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/a30;->e:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ldefpackage/sx1;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/a30;->e:Landroid/animation/ObjectAnimator;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0}, Ldefpackage/a30;->d()V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void
.end method

.method public final j()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/a30;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-array v0, v2, [F

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sget-object v3, Ldefpackage/a30;->o:Ldefpackage/r00;

    .line 13
    .line 14
    invoke-static {p0, v3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Ldefpackage/a30;->d:Landroid/animation/ObjectAnimator;

    .line 19
    .line 20
    const-wide/16 v3, 0x1518

    .line 21
    .line 22
    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ldefpackage/a30;->d:Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v0, v3}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Ldefpackage/a30;->d:Landroid/animation/ObjectAnimator;

    .line 32
    .line 33
    const/4 v3, -0x1

    .line 34
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Ldefpackage/a30;->d:Landroid/animation/ObjectAnimator;

    .line 38
    .line 39
    new-instance v3, Ldefpackage/z20;

    .line 40
    .line 41
    invoke-direct {v3, p0, v1}, Ldefpackage/z20;-><init>(Ldefpackage/a30;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, Ldefpackage/a30;->e:Landroid/animation/ObjectAnimator;

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    new-array v0, v2, [F

    .line 52
    .line 53
    fill-array-data v0, :array_1

    .line 54
    .line 55
    .line 56
    sget-object v2, Ldefpackage/a30;->p:Ldefpackage/r00;

    .line 57
    .line 58
    invoke-static {p0, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Ldefpackage/a30;->e:Landroid/animation/ObjectAnimator;

    .line 63
    .line 64
    const-wide/16 v2, 0x14d

    .line 65
    .line 66
    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Ldefpackage/a30;->e:Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    iget-object v2, p0, Ldefpackage/a30;->f:Ldefpackage/a61;

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Ldefpackage/a30;->e:Landroid/animation/ObjectAnimator;

    .line 77
    .line 78
    new-instance v2, Ldefpackage/z20;

    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    invoke-direct {v2, p0, v3}, Ldefpackage/z20;-><init>(Ldefpackage/a30;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    iput v1, p0, Ldefpackage/a30;->h:I

    .line 88
    .line 89
    iget-object v0, p0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 90
    .line 91
    check-cast v0, [I

    .line 92
    .line 93
    iget-object v2, p0, Ldefpackage/a30;->g:Ldefpackage/g30;

    .line 94
    .line 95
    iget-object v2, v2, Ldefpackage/jq;->c:[I

    .line 96
    .line 97
    aget v2, v2, v1

    .line 98
    .line 99
    iget-object v3, p0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v3, Ldefpackage/sx1;

    .line 102
    .line 103
    iget v3, v3, Ldefpackage/cw0;->w:I

    .line 104
    .line 105
    invoke-static {v2, v3}, Ldefpackage/g12;->l(II)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    aput v2, v0, v1

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    iput v0, p0, Ldefpackage/a30;->j:F

    .line 113
    .line 114
    iget-object p0, p0, Ldefpackage/a30;->d:Landroid/animation/ObjectAnimator;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    nop

    .line 121
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final k()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ldefpackage/a30;->k:Ldefpackage/hq;

    .line 3
    .line 4
    return-void
.end method
