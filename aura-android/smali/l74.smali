.class public final synthetic Ll74;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/SearchFragment;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ll74;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ll74;->o:Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

    .line 4
    .line 5
    iput-object p2, p0, Ll74;->p:Ljava/lang/String;

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
    iget p1, p0, Ll74;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Ll74;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Ll74;->o:Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->h0(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->n0:Ld84;

    .line 15
    .line 16
    iget-object p1, p1, Ld84;->c:Lrm2;

    .line 17
    .line 18
    new-instance v1, Lcom/eddyizm/tempus/model/RecentSearch;

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    invoke-direct {v1, v0, v2, v3}, Lcom/eddyizm/tempus/model/RecentSearch;-><init>(Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Le84;

    .line 26
    .line 27
    iget-object p1, p1, Lrm2;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Ljv3;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v0, p1, v1, v2}, Le84;-><init>(Ljv3;Lcom/eddyizm/tempus/model/RecentSearch;I)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Ljava/lang/Thread;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->i0()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->h0(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
