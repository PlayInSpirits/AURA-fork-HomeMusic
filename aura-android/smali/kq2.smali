.class public final Lkq2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lkq2;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lkq2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .line 1
    iget v0, p0, Lkq2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lkq2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/preference/SeekBarPreference;

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    iget-boolean p3, p0, Landroidx/preference/SeekBarPreference;->k0:Z

    .line 13
    .line 14
    if-nez p3, :cond_0

    .line 15
    .line 16
    iget-boolean p3, p0, Landroidx/preference/SeekBarPreference;->f0:Z

    .line 17
    .line 18
    if-nez p3, :cond_1

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/preference/SeekBarPreference;->F(Landroid/widget/SeekBar;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget p1, p0, Landroidx/preference/SeekBarPreference;->c0:I

    .line 25
    .line 26
    add-int/2addr p2, p1

    .line 27
    iget-object p0, p0, Landroidx/preference/SeekBarPreference;->h0:Landroid/widget/TextView;

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    :goto_0
    return-void

    .line 39
    :pswitch_0
    if-eqz p3, :cond_5

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lwq2;

    .line 46
    .line 47
    check-cast p0, Llq2;

    .line 48
    .line 49
    iget-object p0, p0, Llq2;->J:Ljava/util/HashMap;

    .line 50
    .line 51
    iget-object p3, p1, Lwq2;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ldq2;

    .line 58
    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    const/4 p3, 0x1

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/4 p3, 0x0

    .line 66
    :goto_1
    invoke-virtual {p0, p3}, Ldq2;->t(Z)V

    .line 67
    .line 68
    .line 69
    :cond_4
    invoke-virtual {p1, p2}, Lwq2;->j(I)V

    .line 70
    .line 71
    .line 72
    :cond_5
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    iget v0, p0, Lkq2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lkq2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/preference/SeekBarPreference;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Landroidx/preference/SeekBarPreference;->f0:Z

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Llq2;

    .line 15
    .line 16
    iget-object v0, p0, Llq2;->K:Lwq2;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Llq2;->F:Lzk;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lwq2;

    .line 31
    .line 32
    iput-object p1, p0, Llq2;->K:Lwq2;

    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    iget v0, p0, Lkq2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lkq2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/preference/SeekBarPreference;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Landroidx/preference/SeekBarPreference;->f0:Z

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Landroidx/preference/SeekBarPreference;->c0:I

    .line 18
    .line 19
    add-int/2addr v0, v1

    .line 20
    iget v1, p0, Landroidx/preference/SeekBarPreference;->b0:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroidx/preference/SeekBarPreference;->F(Landroid/widget/SeekBar;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Llq2;

    .line 29
    .line 30
    iget-object p0, p0, Llq2;->F:Lzk;

    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    const-wide/16 v0, 0x1f4

    .line 34
    .line 35
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
