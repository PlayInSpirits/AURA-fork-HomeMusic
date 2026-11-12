.class public final Lz02;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Llv4;

.field public final synthetic v:Lzd0;


# direct methods
.method public constructor <init>(Lzd0;Llv4;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lz02;->v:Lzd0;

    .line 2
    .line 3
    iget-object p1, p2, Llv4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lz02;->u:Llv4;

    .line 11
    .line 12
    iget-object v0, p2, Llv4;->t:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p2, Llv4;->s:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ly02;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, p0, v2}, Ly02;-><init>(Lz02;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lq6;

    .line 37
    .line 38
    const/16 v2, 0xb

    .line 39
    .line 40
    invoke-direct {v0, v2, p0}, Lq6;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p2, Llv4;->r:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Landroid/widget/ImageView;

    .line 49
    .line 50
    new-instance p2, Ly02;

    .line 51
    .line 52
    invoke-direct {p2, p0, v1}, Ly02;-><init>(Lz02;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final s()V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lz02;->v:Lzd0;

    .line 7
    .line 8
    iget-object v2, v1, Lzd0;->r:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcx3;->c()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/os/Parcelable;

    .line 19
    .line 20
    const-string v2, "INTERNET_RADIO_STATION_OBJECT"

    .line 21
    .line 22
    invoke-virtual {v0, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, v1, Lzd0;->s:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lhp1;

    .line 28
    .line 29
    invoke-interface {p0, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onInternetRadioStationLongClick(Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
