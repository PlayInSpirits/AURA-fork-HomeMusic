.class public final synthetic Lds1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/homemusic/HubFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lds1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lds1;->o:Lcom/eddyizm/tempus/homemusic/HubFragment;

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
    .locals 2

    .line 1
    iget p1, p0, Lds1;->n:I

    .line 2
    .line 3
    const-string v0, "activity"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object p0, p0, Lds1;->o:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 16
    .line 17
    const p1, 0x7f0a056d

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->o0:Ljava/lang/String;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-virtual {p0, p1, v0}, Lcom/eddyizm/tempus/homemusic/HubFragment;->h0(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 36
    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    const p1, 0x7f0a01da

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ldf;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->q()V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    :cond_2
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
