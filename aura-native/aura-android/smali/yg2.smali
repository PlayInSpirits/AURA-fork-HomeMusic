.class public abstract Lyg2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/animation/TimeInterpolator;

.field public final b:Landroid/view/View;

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Loo;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyg2;->b:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Landroid/view/animation/PathInterpolator;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/high16 v2, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-direct {v0, v1, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 16
    .line 17
    .line 18
    const v1, 0x7f0403a4

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v1, v0}, Lg12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lyg2;->a:Landroid/animation/TimeInterpolator;

    .line 26
    .line 27
    const v0, 0x7f040393

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x12c

    .line 31
    .line 32
    invoke-static {p1, v0, v1}, Lg12;->N(Landroid/content/Context;II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput v0, p0, Lyg2;->c:I

    .line 37
    .line 38
    const v0, 0x7f040398

    .line 39
    .line 40
    .line 41
    const/16 v1, 0x96

    .line 42
    .line 43
    invoke-static {p1, v0, v1}, Lg12;->N(Landroid/content/Context;II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, p0, Lyg2;->d:I

    .line 48
    .line 49
    const v0, 0x7f040397

    .line 50
    .line 51
    .line 52
    const/16 v1, 0x64

    .line 53
    .line 54
    invoke-static {p1, v0, v1}, Lg12;->N(Landroid/content/Context;II)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput p1, p0, Lyg2;->e:I

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a()Loo;
    .locals 2

    .line 1
    iget-object v0, p0, Lyg2;->f:Loo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "MaterialBackHelper"

    .line 6
    .line 7
    const-string v1, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()"

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lyg2;->f:Loo;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lyg2;->f:Loo;

    .line 16
    .line 17
    return-object v0
.end method
