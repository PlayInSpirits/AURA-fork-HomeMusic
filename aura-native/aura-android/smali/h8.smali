.class public final synthetic Lh8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

.field public final synthetic p:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p3, p0, Lh8;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lh8;->o:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 4
    .line 5
    iput-object p2, p0, Lh8;->p:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Lh8;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v1, "album"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object v3, p0, Lh8;->p:Ljava/util/List;

    .line 8
    .line 9
    iget-object p0, p0, Lh8;->o:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {v3}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->q0:Lbl2;

    .line 18
    .line 19
    invoke-static {p1, v3, v2, v1}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 25
    .line 26
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lau;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lau;->d(Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->q0:Lbl2;

    .line 35
    .line 36
    invoke-static {p1, v3, v2, v1}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 40
    .line 41
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 42
    .line 43
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lau;

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lau;->d(Z)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
