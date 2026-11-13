.class public final Ldefpackage/jr3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/lt2;


# instance fields
.field public final a:Ldefpackage/bi0;

.field public final b:Ldefpackage/ss2;

.field public c:Ldefpackage/yc5;

.field public final d:Ldefpackage/i80;

.field public e:I


# direct methods
.method public constructor <init>(Ldefpackage/bi0;Ldefpackage/n51;)V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/ss2;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p2, Ldefpackage/yc5;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {p2, v1}, Ldefpackage/yc5;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ldefpackage/i80;

    .line 15
    .line 16
    const/16 v2, 0x1c

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ldefpackage/i80;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ldefpackage/jr3;->a:Ldefpackage/bi0;

    .line 25
    .line 26
    iput-object v0, p0, Ldefpackage/jr3;->b:Ldefpackage/ss2;

    .line 27
    .line 28
    iput-object p2, p0, Ldefpackage/jr3;->c:Ldefpackage/yc5;

    .line 29
    .line 30
    iput-object v1, p0, Ldefpackage/jr3;->d:Ldefpackage/i80;

    .line 31
    .line 32
    const/high16 p1, 0x100000

    .line 33
    .line 34
    iput p1, p0, Ldefpackage/jr3;->e:I

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Ldefpackage/gn2;)Ldefpackage/bq;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/jr3;->f(Ldefpackage/gn2;)Ldefpackage/kr3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final e(Ldefpackage/yc5;)Ldefpackage/lt2;
    .locals 1

    .line 1
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldefpackage/jr3;->c:Ldefpackage/yc5;

    .line 7
    .line 8
    return-object p0
.end method

.method public final f(Ldefpackage/gn2;)Ldefpackage/kr3;
    .locals 9

    .line 1
    iget-object v0, p1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ldefpackage/kr3;

    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/jr3;->c:Ldefpackage/yc5;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ldefpackage/yc5;->b(Ldefpackage/gn2;)Ldefpackage/ww0;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget v7, p0, Ldefpackage/jr3;->e:I

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    iget-object v3, p0, Ldefpackage/jr3;->a:Ldefpackage/bi0;

    .line 18
    .line 19
    iget-object v4, p0, Ldefpackage/jr3;->b:Ldefpackage/ss2;

    .line 20
    .line 21
    iget-object v6, p0, Ldefpackage/jr3;->d:Ldefpackage/i80;

    .line 22
    .line 23
    move-object v2, p1

    .line 24
    invoke-direct/range {v1 .. v8}, Ldefpackage/kr3;-><init>(Ldefpackage/gn2;Ldefpackage/bi0;Ldefpackage/ss2;Ldefpackage/ww0;Ldefpackage/i80;ILdefpackage/tb1;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method
