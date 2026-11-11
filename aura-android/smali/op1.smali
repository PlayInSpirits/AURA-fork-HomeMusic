.class public final Lop1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/StarCallback;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/model/Favorite;

.field public final synthetic o:Lcom/eddyizm/tempus/viewmodel/b;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/viewmodel/b;Lcom/eddyizm/tempus/model/Favorite;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lop1;->o:Lcom/eddyizm/tempus/viewmodel/b;

    .line 5
    .line 6
    iput-object p2, p0, Lop1;->n:Lcom/eddyizm/tempus/model/Favorite;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onRefused()V
    .locals 1

    .line 1
    iget-object v0, p0, Lop1;->o:Lcom/eddyizm/tempus/viewmodel/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->g:Ld34;

    .line 4
    .line 5
    iget-object p0, p0, Lop1;->n:Lcom/eddyizm/tempus/model/Favorite;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ld34;->C(Lcom/eddyizm/tempus/model/Favorite;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onSuccess()V
    .locals 1

    .line 1
    iget-object v0, p0, Lop1;->o:Lcom/eddyizm/tempus/viewmodel/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->g:Ld34;

    .line 4
    .line 5
    iget-object p0, p0, Lop1;->n:Lcom/eddyizm/tempus/model/Favorite;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ld34;->C(Lcom/eddyizm/tempus/model/Favorite;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
