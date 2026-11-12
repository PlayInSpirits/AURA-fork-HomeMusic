.class public final synthetic Lx11;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx11;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lx11;->o:Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lx11;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lx11;->o:Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 13
    .line 14
    invoke-virtual {p0}, Lv23;->o()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "activity"

    .line 19
    .line 20
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0

    .line 25
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->n0:Lwo0;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object p1, p1, Lwo0;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lv11;

    .line 33
    .line 34
    invoke-interface {p1}, Lv11;->b()S

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-interface {p1}, Lv11;->d()[S

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    new-array v1, v1, [S

    .line 47
    .line 48
    const/16 v3, -0x5dc

    .line 49
    .line 50
    aput-short v3, v1, v2

    .line 51
    .line 52
    const/16 v3, 0x5dc

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    aput-short v3, v1, v4

    .line 56
    .line 57
    :cond_2
    aget-short v1, v1, v2

    .line 58
    .line 59
    div-int/lit8 v1, v1, 0x64

    .line 60
    .line 61
    move v3, v2

    .line 62
    :goto_0
    if-ge v3, v0, :cond_4

    .line 63
    .line 64
    int-to-short v4, v3

    .line 65
    invoke-interface {p1, v4, v2}, Lv11;->v(SS)V

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->s0:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {v4, v3}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Landroid/widget/SeekBar;

    .line 75
    .line 76
    if-eqz v4, :cond_3

    .line 77
    .line 78
    rsub-int/lit8 v5, v1, 0x0

    .line 79
    .line 80
    invoke-virtual {v4, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 81
    .line 82
    .line 83
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    new-array p1, v0, [S

    .line 87
    .line 88
    invoke-static {p1}, Lud3;->k0([S)V

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->k0()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
