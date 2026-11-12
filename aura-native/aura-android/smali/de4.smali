.class public final synthetic Lde4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgo4;


# instance fields
.field public final synthetic n:Lqe4;

.field public final synthetic o:Lpe4;

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lqe4;Lpe4;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lde4;->n:Lqe4;

    .line 5
    .line 6
    iput-object p2, p0, Lde4;->o:Lpe4;

    .line 7
    .line 8
    iput p3, p0, Lde4;->p:I

    .line 9
    .line 10
    iput p4, p0, Lde4;->q:I

    .line 11
    .line 12
    iput p5, p0, Lde4;->r:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lde4;->n:Lqe4;

    .line 2
    .line 3
    iget-object v1, v0, Lqe4;->g:Lzt4;

    .line 4
    .line 5
    iget-object v0, v0, Lfq;->b:Lbu4;

    .line 6
    .line 7
    iget-object v2, p0, Lde4;->o:Lpe4;

    .line 8
    .line 9
    invoke-static {v2, v1, v0}, Lqe4;->Z0(Lpe4;Lzt4;Lbu4;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget v4, p0, Lde4;->p:I

    .line 14
    .line 15
    iget v5, p0, Lde4;->q:I

    .line 16
    .line 17
    iget p0, p0, Lde4;->r:I

    .line 18
    .line 19
    invoke-static {v3, v4, v5, p0}, Lf35;->P(Ljava/util/ArrayList;III)V

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3, v1, v0}, Lqe4;->j1(Lpe4;Ljava/util/ArrayList;Lzt4;Lbu4;)Lpe4;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
