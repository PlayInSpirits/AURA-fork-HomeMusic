.class public final synthetic Ly02;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lz02;


# direct methods
.method public synthetic constructor <init>(Lz02;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly02;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ly02;->o:Lz02;

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
    iget p1, p0, Ly02;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ly02;->o:Lz02;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lz02;->s()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    new-instance p1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lz02;->v:Lzd0;

    .line 18
    .line 19
    iget-object v1, v0, Lzd0;->r:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcx3;->c()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Landroid/os/Parcelable;

    .line 30
    .line 31
    const-string v1, "INTERNET_RADIO_STATION_OBJECT"

    .line 32
    .line 33
    invoke-virtual {p1, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v0, Lzd0;->s:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lhp1;

    .line 39
    .line 40
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onInternetRadioStationClick(Landroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
