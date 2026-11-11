.class public final synthetic Lqt2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwc0;


# instance fields
.field public final synthetic n:Lue1;

.field public final synthetic o:Led2;

.field public final synthetic p:Lun2;

.field public final synthetic q:Ljava/io/IOException;

.field public final synthetic r:Z


# direct methods
.method public synthetic constructor <init>(Lue1;Led2;Lun2;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqt2;->n:Lue1;

    .line 5
    .line 6
    iput-object p2, p0, Lqt2;->o:Led2;

    .line 7
    .line 8
    iput-object p3, p0, Lqt2;->p:Lun2;

    .line 9
    .line 10
    iput-object p4, p0, Lqt2;->q:Ljava/io/IOException;

    .line 11
    .line 12
    iput-boolean p5, p0, Lqt2;->r:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lst2;

    .line 3
    .line 4
    iget-object p1, p0, Lqt2;->n:Lue1;

    .line 5
    .line 6
    iget v1, p1, Lue1;->o:I

    .line 7
    .line 8
    iget-object p1, p1, Lue1;->p:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Lmt2;

    .line 12
    .line 13
    iget-object v3, p0, Lqt2;->o:Led2;

    .line 14
    .line 15
    iget-object v4, p0, Lqt2;->p:Lun2;

    .line 16
    .line 17
    iget-object v5, p0, Lqt2;->q:Ljava/io/IOException;

    .line 18
    .line 19
    iget-boolean v6, p0, Lqt2;->r:Z

    .line 20
    .line 21
    invoke-interface/range {v0 .. v6}, Lst2;->y(ILmt2;Led2;Lun2;Ljava/io/IOException;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
