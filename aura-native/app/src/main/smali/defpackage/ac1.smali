.class public abstract Ldefpackage/ac1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ej4;


# instance fields
.field private final delegate:Ldefpackage/ej4;


# direct methods
.method public constructor <init>(Ldefpackage/ej4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/ac1;->delegate:Ldefpackage/ej4;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final -deprecated_delegate()Ldefpackage/ej4;
    .locals 0
    .annotation runtime Ldefpackage/zo0;
    .end annotation

    .line 1
    iget-object p0, p0, Ldefpackage/ac1;->delegate:Ldefpackage/ej4;

    .line 2
    .line 3
    return-object p0
.end method

.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ac1;->delegate:Ldefpackage/ej4;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final delegate()Ldefpackage/ej4;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ac1;->delegate:Ldefpackage/ej4;

    .line 2
    .line 3
    return-object p0
.end method

.method public read(Ldefpackage/tv;J)J
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/ac1;->delegate:Ldefpackage/ej4;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2, p3}, Ldefpackage/ej4;->read(Ldefpackage/tv;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    return-wide p0
.end method

.method public timeout()Ldefpackage/fu4;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ac1;->delegate:Ldefpackage/ej4;

    .line 2
    .line 3
    invoke-interface {p0}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x28

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/ac1;->delegate:Ldefpackage/ej4;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 p0, 0x29

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
