.class public final synthetic Lee4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgo4;


# instance fields
.field public final synthetic n:Lqe4;

.field public final synthetic o:Z

.field public final synthetic p:Lpe4;

.field public final synthetic q:I

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lqe4;ZLpe4;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lee4;->n:Lqe4;

    .line 5
    .line 6
    iput-boolean p2, p0, Lee4;->o:Z

    .line 7
    .line 8
    iput-object p3, p0, Lee4;->p:Lpe4;

    .line 9
    .line 10
    iput p4, p0, Lee4;->q:I

    .line 11
    .line 12
    iput-wide p5, p0, Lee4;->r:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lee4;->o:Z

    .line 2
    .line 3
    iget-object v1, p0, Lee4;->p:Lpe4;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    const/4 v2, 0x0

    .line 9
    iget-object v0, p0, Lee4;->n:Lqe4;

    .line 10
    .line 11
    iget-object v6, v0, Lfq;->b:Lbu4;

    .line 12
    .line 13
    iget v3, p0, Lee4;->q:I

    .line 14
    .line 15
    iget-wide v4, p0, Lee4;->r:J

    .line 16
    .line 17
    invoke-static/range {v1 .. v6}, Lqe4;->k1(Lpe4;Ljava/util/ArrayList;IJLbu4;)Lpe4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
