.class public interface abstract Lul1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lu72;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls72;

    .line 2
    .line 3
    sget-object v0, Ls72;->a:Ljava/util/Map;

    .line 4
    .line 5
    new-instance v1, Lu72;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lu72;-><init>(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    sput-object v1, Lul1;->a:Lu72;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
