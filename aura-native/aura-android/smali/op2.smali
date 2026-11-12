.class public final Lop2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final a:Lg5;

.field public final synthetic b:Lqp2;


# direct methods
.method public constructor <init>(Lqp2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lop2;->b:Lqp2;

    .line 5
    .line 6
    new-instance p1, Lg5;

    .line 7
    .line 8
    const/16 v0, 0x16

    .line 9
    .line 10
    invoke-direct {p1, v0, p0}, Lg5;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lop2;->a:Lg5;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwq2;

    .line 8
    .line 9
    sget p1, Lqp2;->B0:I

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Lwq2;->j(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lop2;->b:Lqp2;

    .line 2
    .line 3
    iget-object v1, v0, Lqp2;->Z:Lwq2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lqp2;->X:Landroid/widget/SeekBar;

    .line 8
    .line 9
    iget-object p0, p0, Lop2;->a:Lg5;

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lwq2;

    .line 19
    .line 20
    iput-object p0, v0, Lqp2;->Z:Lwq2;

    .line 21
    .line 22
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lop2;->b:Lqp2;

    .line 2
    .line 3
    iget-object p1, p1, Lqp2;->X:Landroid/widget/SeekBar;

    .line 4
    .line 5
    iget-object p0, p0, Lop2;->a:Lg5;

    .line 6
    .line 7
    const-wide/16 v0, 0x1f4

    .line 8
    .line 9
    invoke-virtual {p1, p0, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method
