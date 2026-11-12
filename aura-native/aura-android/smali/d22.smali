.class public final Ld22;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Z

.field public final synthetic o:Lf22;


# direct methods
.method public constructor <init>(Lf22;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld22;->o:Lf22;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Ld22;->n:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ld22;->o:Lf22;

    .line 2
    .line 3
    iget-object v1, v0, Lf22;->m:Le22;

    .line 4
    .line 5
    iget-boolean p0, p0, Ld22;->n:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lf22;->n(Landroid/view/MotionEvent;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v2, v0, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v2, p0}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Lcx3;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object v2, v0, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget v3, v1, Le22;->c:I

    .line 27
    .line 28
    or-int/lit8 v4, v3, 0x3

    .line 29
    .line 30
    shl-int/lit8 v3, v3, 0x8

    .line 31
    .line 32
    or-int/2addr v3, v4

    .line 33
    const/high16 v4, 0x30000

    .line 34
    .line 35
    or-int/2addr v3, v4

    .line 36
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v3, v2}, Le22;->b(II)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/high16 v3, 0xff0000

    .line 45
    .line 46
    and-int/2addr v2, v3

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iget v3, v0, Lf22;->l:I

    .line 55
    .line 56
    if-ne v2, v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput v3, v0, Lf22;->d:F

    .line 71
    .line 72
    iput p1, v0, Lf22;->e:F

    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    iput p1, v0, Lf22;->i:F

    .line 76
    .line 77
    iput p1, v0, Lf22;->h:F

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    instance-of p1, v1, Lvl3;

    .line 83
    .line 84
    if-nez p1, :cond_1

    .line 85
    .line 86
    const/4 p1, 0x2

    .line 87
    invoke-virtual {v0, p0, p1}, Lf22;->r(Lcx3;I)V

    .line 88
    .line 89
    .line 90
    :cond_1
    :goto_0
    return-void
.end method
