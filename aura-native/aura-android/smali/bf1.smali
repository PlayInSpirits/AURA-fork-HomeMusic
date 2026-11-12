.class public final Lbf1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lso4;


# instance fields
.field public final n:Landroid/content/Context;

.field public final o:Ljava/lang/String;

.field public final p:Luv;

.field public final q:Z

.field public final r:Z

.field public final s:Lrp4;

.field public t:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Luv;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lbf1;->n:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lbf1;->o:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lbf1;->p:Luv;

    .line 15
    .line 16
    iput-boolean p4, p0, Lbf1;->q:Z

    .line 17
    .line 18
    iput-boolean p5, p0, Lbf1;->r:Z

    .line 19
    .line 20
    new-instance p1, Lwc;

    .line 21
    .line 22
    const/4 p2, 0x5

    .line 23
    invoke-direct {p1, p2, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance p2, Lrp4;

    .line 27
    .line 28
    invoke-direct {p2, p1}, Lrp4;-><init>(Lgf1;)V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, Lbf1;->s:Lrp4;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbf1;->s:Lrp4;

    .line 2
    .line 3
    iget-object v0, v0, Lrp4;->o:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lrv2;->H:Lrv2;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lbf1;->s:Lrp4;

    .line 10
    .line 11
    invoke-virtual {p0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Laf1;

    .line 16
    .line 17
    invoke-virtual {p0}, Laf1;->close()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final getDatabaseName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbf1;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbf1;->s:Lrp4;

    .line 2
    .line 3
    iget-object v0, v0, Lrp4;->o:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v1, Lrv2;->H:Lrv2;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lbf1;->s:Lrp4;

    .line 10
    .line 11
    invoke-virtual {v0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Laf1;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-boolean p1, p0, Lbf1;->t:Z

    .line 21
    .line 22
    return-void
.end method

.method public final w()Lwe1;
    .locals 1

    .line 1
    iget-object p0, p0, Lbf1;->s:Lrp4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Laf1;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Laf1;->b(Z)Lwe1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final z()Lwe1;
    .locals 1

    .line 1
    iget-object p0, p0, Lbf1;->s:Lrp4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Laf1;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Laf1;->b(Z)Lwe1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
