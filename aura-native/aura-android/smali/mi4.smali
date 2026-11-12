.class public final Lmi4;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ly12;

.field public final synthetic v:Lni4;


# direct methods
.method public constructor <init>(Lni4;Ly12;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lmi4;->v:Lni4;

    .line 2
    .line 3
    iget-object p1, p2, Ly12;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lmi4;->u:Ly12;

    .line 9
    .line 10
    iget-object v0, p2, Ly12;->q:Landroid/widget/TextView;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p2, Ly12;->p:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lli4;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v0, p0, v2}, Lli4;-><init>(Lmi4;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lq6;

    .line 31
    .line 32
    const/16 v2, 0x18

    .line 33
    .line 34
    invoke-direct {v0, v2, p0}, Lq6;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p2, Ly12;->o:Landroid/widget/FrameLayout;

    .line 41
    .line 42
    new-instance p2, Lli4;

    .line 43
    .line 44
    invoke-direct {p2, p0, v1}, Lli4;-><init>(Lmi4;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final s()V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmi4;->v:Lni4;

    .line 7
    .line 8
    iget-object v2, v1, Lni4;->v:Lpk;

    .line 9
    .line 10
    iget-object v2, v2, Lpk;->f:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcx3;->c()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Landroid/os/Parcelable;

    .line 21
    .line 22
    const-string v3, "TRACK_OBJECT"

    .line 23
    .line 24
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "ITEM_POSITION"

    .line 28
    .line 29
    invoke-virtual {p0}, Lcx3;->c()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v1, Lni4;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 37
    .line 38
    invoke-interface {p0, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaLongClick(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final t()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcx3;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Lmi4;->v:Lni4;

    .line 11
    .line 12
    iget-object v1, p0, Lni4;->B:Lrm3;

    .line 13
    .line 14
    iget-object p0, p0, Lni4;->v:Lpk;

    .line 15
    .line 16
    iget-object p0, p0, Lpk;->f:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, v1, Lrm3;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object p0, v1, Lrm3;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lvo1;

    .line 54
    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Lvo1;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_2
    const/4 p0, 0x1

    .line 61
    return p0
.end method
