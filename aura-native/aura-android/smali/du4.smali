.class public final Ldu4;
.super Lbc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final f:Lgn2;


# direct methods
.method public constructor <init>(Lcu4;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbc1;-><init>(Lcu4;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ldu4;->f:Lgn2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(ILbu4;J)Lbu4;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lbc1;->m(ILbu4;J)Lbu4;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldu4;->f:Lgn2;

    .line 5
    .line 6
    iput-object p0, p2, Lbu4;->b:Lgn2;

    .line 7
    .line 8
    iget-object p0, p0, Lgn2;->b:Lbn2;

    .line 9
    .line 10
    return-object p2
.end method
