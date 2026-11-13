.class public final Ldefpackage/va2;
.super Ldefpackage/rx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final j:Ldefpackage/r00;


# instance fields
.field public d:Landroid/animation/ObjectAnimator;

.field public final e:Ldefpackage/a61;

.field public final f:Ldefpackage/cb2;

.field public g:I

.field public h:Z

.field public i:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/r00;

    .line 2
    .line 3
    const-string v1, "animationFraction"

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const-class v3, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Ldefpackage/r00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ldefpackage/va2;->j:Ldefpackage/r00;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ldefpackage/cb2;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Ldefpackage/rx1;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Ldefpackage/va2;->g:I

    .line 7
    .line 8
    iput-object p1, p0, Ldefpackage/va2;->f:Ldefpackage/cb2;

    .line 9
    .line 10
    new-instance p1, Ldefpackage/a61;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ldefpackage/a61;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/va2;->e:Ldefpackage/a61;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/va2;->d:Landroid/animation/ObjectAnimator;

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
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/va2;->h:Z

    .line 3
    .line 4
    iput v0, p0, Ldefpackage/va2;->g:I

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, [I

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/va2;->f:Ldefpackage/cb2;

    .line 11
    .line 12
    iget-object v1, v1, Ldefpackage/jq;->c:[I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aget v1, v1, v2

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ldefpackage/sx1;

    .line 20
    .line 21
    iget p0, p0, Ldefpackage/cw0;->w:I

    .line 22
    .line 23
    invoke-static {v1, p0}, Ldefpackage/g12;->l(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {v0, p0}, Ljava/util/Arrays;->fill([II)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final g(Ldefpackage/hq;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    return-void
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/va2;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    fill-array-data v0, :array_0

    .line 9
    .line 10
    .line 11
    sget-object v1, Ldefpackage/va2;->j:Ldefpackage/r00;

    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Ldefpackage/va2;->d:Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    const-wide/16 v1, 0x14d

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ldefpackage/va2;->d:Landroid/animation/ObjectAnimator;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ldefpackage/va2;->d:Landroid/animation/ObjectAnimator;

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Ldefpackage/va2;->d:Landroid/animation/ObjectAnimator;

    .line 37
    .line 38
    new-instance v1, Ldefpackage/l4;

    .line 39
    .line 40
    const/16 v2, 0xa

    .line 41
    .line 42
    invoke-direct {v1, v2, p0}, Ldefpackage/l4;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Ldefpackage/va2;->h:Z

    .line 50
    .line 51
    iput v0, p0, Ldefpackage/va2;->g:I

    .line 52
    .line 53
    iget-object v0, p0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 54
    .line 55
    check-cast v0, [I

    .line 56
    .line 57
    iget-object v1, p0, Ldefpackage/va2;->f:Ldefpackage/cb2;

    .line 58
    .line 59
    iget-object v1, v1, Ldefpackage/jq;->c:[I

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    aget v1, v1, v2

    .line 63
    .line 64
    iget-object v2, p0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Ldefpackage/sx1;

    .line 67
    .line 68
    iget v2, v2, Ldefpackage/cw0;->w:I

    .line 69
    .line 70
    invoke-static {v1, v2}, Ldefpackage/g12;->l(II)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, Ldefpackage/va2;->d:Landroid/animation/ObjectAnimator;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final k()V
    .locals 0

    .line 1
    return-void
.end method
